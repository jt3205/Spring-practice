package test01;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class FirstJdbcDaoImpl extends JdbcDaoSupport implements FirstJdbcDao{

	@Override
	public void execute(String sql) {
		System.out.println("교재코드   교재명   가격      출판사");
		System.out.println("=========================");
		super.getJdbcTemplate().query(sql, new GoodsRowMapper<Object>());
	}
	
	//중첩클래스(inner class:클래스 안에서 다른 클래스를 정의하는것), 사용자 정의 클래스
	public class GoodsRowMapper<T> implements RowMapper<T>{

		@Override
		public T mapRow(ResultSet rs, int rowNum) throws SQLException {
			String code=rs.getString("CODE");  // 컬럼명(대.소문자를 구분하지 않음)
			String name=rs.getString("NAME");
			int price=rs.getInt("PRICE");
			String maker=rs.getString("MAKER");
			System.out.printf("%s    %s    %d   %s\n", code, name, price, maker);
			return null;
		}
		
	}
	//----------------------------------------------------------------------
	@Override
	public int insert(String code, String name, int price, String maker) {
		return super.getJdbcTemplate().update(
				"INSERT INTO GOODSINFO(CODE,NAME,PRICE,MAKER) VALUES(?,?,?,?)",
				new Object[] {code, name, price, maker});
	}
	//-----------------------------------------------------------------------
	@Override
	public int delete(String name) {
		return super.getJdbcTemplate().update(
				"DELETE FROM GOODSINFO WHERE NAME=?",name);
	}
}







