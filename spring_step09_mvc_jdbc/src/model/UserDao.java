package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entity.UserVO;

@Repository("userDAO")
public class UserDAO {
	JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean insertUser(UserVO user) {
		int n = jdbcTemplate.update("insert into user1(name,age,hobby) values(?,?,?)", new Object[] {user.getName(), user.getAge(), user.getHobby()});
		return false;
	}
	public List<UserVO> listUser() {
		List<UserVO> list=jdbcTemplate.query("SELECT * FROM USER1", 
			      new RowMapper<UserVO>(){

						@Override
						public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
							UserVO ob=new UserVO();
							ob.setName(rs.getString("NAME"));
							ob.setAge(rs.getInt("AGE"));
							ob.setHobby(rs.getString("HOBBY"));
							return ob;
						}
			});
		return list;
	}
}
