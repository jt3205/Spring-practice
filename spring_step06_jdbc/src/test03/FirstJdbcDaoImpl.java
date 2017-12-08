package test03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao{
	
	@Override   //�߰�
	public int insert(GoodsEntity entity) {
		return super.getJdbcTemplate().update(
				"INSERT INTO GOODSINFO(CODE,NAME,PRICE,MAKER) VALUES(?,?,?,?)",
				new Object[]{entity.getCode(), entity.getName(), entity.getPrice(), entity.getMaker()});
	
	}
	//-----------------------------------------------------------------------------
	@Override   //��ü����-1
	public void execute(String sql) {
		System.out.println("�����ڵ�   �����   ����   ���ǻ�");
		System.out.println("=================================");
		
		RowMapper<GoodsEntity> mapper=new RowMapper<GoodsEntity>(){

			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				String code=rs.getString("CODE");
				String name=rs.getString("NAME");
				int price=rs.getInt("PRICE");
				String maker=rs.getString("MAKER");
				System.out.printf("%s  %s  %d  %s\n", code, name, price, maker);
				
				return null;
			}
		};
		super.getJdbcTemplate().query(sql, mapper);
	}
	//-----------------------------------------------------------------------------
	@Override  //��ü����-2
	public List<GoodsEntity> listGoods() {
		RowMapper<GoodsEntity> rowMapper=new GoodsRowMapper();
		return super.getJdbcTemplate().query("SELECT * FROM GOODSINFO", rowMapper);
	}

	public class GoodsRowMapper implements RowMapper<GoodsEntity>{

		@Override
		public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			GoodsEntity entity=new GoodsEntity();
			entity.setCode(rs.getString("CODE"));
			entity.setName(rs.getString("NAME"));
			entity.setPrice(rs.getInt("PRICE"));
			entity.setMaker(rs.getString("MAKER"));
			return entity;
		}		
	}
	//-----------------------------------------------------------------------------
	@Override  //����
	public int delete(String name) {
		return super.getJdbcTemplate().
				update("DELETE FROM GOODSINFO WHERE NAME=?", 
				new Object[]{name});
	}
	//-----------------------------------------------------------------------------
	@Override //����
	public int updateGoods(GoodsEntity entity) {
		return super.getJdbcTemplate().
				update("UPDATE  GOODSINFO SET NAME=?, PRICE=?, MAKER=? WHERE CODE=?", 
				 new Object[]{entity.getName(), entity.getPrice(), entity.getMaker(), entity.getCode()});
	}
	//-----------------------------------------------------------------------------
	@Override   //ã��
	public GoodsEntity findGoods(String code) {
		String sql="SELECT * FROM GOODSINFO WHERE CODE=?";

		RowMapper<GoodsEntity> mapper=new RowMapper<GoodsEntity>(){
			
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				GoodsEntity entity=new GoodsEntity();
				entity.setCode(rs.getString("CODE"));
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));
				entity.setMaker(rs.getString("MAKER"));
				return entity;
			}
		};
		return super.getJdbcTemplate().queryForObject(sql, mapper, new Object[]{code});
	}
}

















