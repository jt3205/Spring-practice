package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.UserVO;
import model.UserService;

@Controller
public class UserController {
	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@RequestMapping("/insert.sp")
	public String insert(Model model) {
		return "/WEB-INF/view/insert.jsp";
	}
	
	@RequestMapping(value="/insertProc.sp", method=RequestMethod.POST)
	public String insertProc(@ModelAttribute UserVO user) {
		if(userService.insertUser(user) == true) {
			return "/list.sp";
		}
		return "/WEB-INF/view/insert.jsp";
	}
}
