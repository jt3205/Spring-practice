package model;

import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import entity.User;

@Repository("userDao")
public class UserDao {
	@Autowired
	private SqlSessionFactory factory;
	
	public boolean insertUser(User user) {
		int n=factory.openSession().insert("usernamespace.insertUser",user);
		return (n>0)?true:false;
	}
	//-----------------------------------------------------
	public List<User> listUser() {
		return factory.openSession().selectList("usernamespace.listUser");
	}
	
}




