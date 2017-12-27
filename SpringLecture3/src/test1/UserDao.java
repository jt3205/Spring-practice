package test1;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface UserDao {
	public List<UserDTO> selectList() throws DataAccessException;
	public double avgSal() throws DataAccessException;
	public List selectSearch(String name) throws DataAccessException;
}
