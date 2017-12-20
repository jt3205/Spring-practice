package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.User;
import model.UserService;

@Controller
public class UserController {
	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	//추가하기(화면)------------------------------------------
	@RequestMapping("/insert.sp")
	public String insert(Model model) {
		return "/WEB-INF/view/insert.jsp";
	}
	//추가하기(비즈니스로직)-------------------------------------
	@RequestMapping(value="/insertProc.sp",method=RequestMethod.POST)
	public String insertProc(@ModelAttribute User user){
		//System.out.println("이름:"+user.getName());
		
		if(userService.insertUser(user)==true)
			return "/list.sp";
		else
			return "/WEB-INF/view/insert.jsp";
	}
	//전체출력하기---------------------------------------------
	@RequestMapping("/list.sp")
	public String list(Model model) {
		model.addAttribute("list", userService.listUser());
		return "/WEB-INF/view/list.jsp";
	}
}





