package test02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao{

	@Override
	public List<GoodsEntity> listGoods() {
		RowMapper<GoodsEntity> rowMapper=new GoodsRowMapper();
		return super.getJdbcTemplate().query("SELECT * FROM GOODSINFO", rowMapper);
	}
	
	//��øŬ����:Ŭ���� �ȿ��� �� �ٸ� Ŭ������ ����°�
	//  		FirstJdbcDaoImpl.class
	//  		FirstJdbcDaoImpl$GoodsRowMapper.class
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
	//---------------------------------------------------------------
	@Override
	public GoodsEntity findGoods(String code) {
		String sql="SELECT * FROM GOODSINFO WHERE CODE=?";
		
		//�͸���øŬ����(annonymous inner class) : �޼��� �ȿ��� Ŭ������ �޼��带 ������
		//      FirstJdbcDaoImpl.class       
		//      FirstJdbcDaoImpl$1.class
		RowMapper<GoodsEntity> mapper=new RowMapper<GoodsEntity>(){
			@Override
			public GoodsEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				GoodsEntity entity=new GoodsEntity();
				entity.setCode(rs.getString("CODE"));
				entity.setName(rs.getString("NAME"));
				entity.setPrice(rs.getInt("PRICE"));
				entity.setMaker(rs.getString("MAKER"));				
				return entity;
			}		
		};
		return super.getJdbcTemplate().queryForObject(sql, mapper, code);
	}
	//---------------------------------------------------------------
	@Override
	public int update(String name, int price, String maker, String code) {
		return super.getJdbcTemplate()
		          .update("UPDATE GOODSINFO SET NAME=?,PRICE=?,MAKER=? WHERE CODE=?",
				               new Object[]{name,price,maker,code});
	}

}






