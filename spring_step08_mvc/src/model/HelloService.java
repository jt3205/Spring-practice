package model;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {
	@Autowired
	private HelloDAO helloDAO;
	public String getHello() {
		return helloDAO.getHello();
	}

}
