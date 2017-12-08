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
	
	//중첩클래스:클래스 안에서 또 다른 클래스를 만드는것
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
		
		//익명중첩클래스(annonymous inner class) : 메서드 안에서 클래스의 메서드를 재정의
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






