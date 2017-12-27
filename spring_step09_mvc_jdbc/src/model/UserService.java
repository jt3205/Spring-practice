package model;

import org.springframework.beans.factory.annotation.Autowired;

import entity.UserVO;

public class UserService {
	private UserDAO userDAO;
	
	@Autowired
	public UserService(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	public boolean insertUser(UserVO user) {
		
		return false;
	}

}
