package test1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDaoImpl implements UserDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public List<UserDTO> selectList() throws DataAccessException {
		//������ �ϼ��Ͻÿ�
		return null;
	}
	//----------------------------------------------------------------------------
	@Override
	public double avgSal() throws DataAccessException {
		//������ �ϼ��Ͻÿ�
		return 0;
	}
	//----------------------------------------------------------------------------
	@Override
	public List selectSearch(String name) throws DataAccessException {
		Object[] data = {"%" + name+"%"};
		
		//������ �ϼ��Ͻÿ�
		return null;
	}
}









