package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView insert() {
		return new ModelAndView("insert");
	}
	//추가하기(비즈니스로직)-------------------------------------
	@RequestMapping(value="/insertProc.sp",method=RequestMethod.POST)
	public ModelAndView insertProc(@ModelAttribute User user){
		//System.out.println("이름:"+user.getName());
		
		if(userService.insertUser(user)==true)
			return list();
		else
			return new ModelAndView("insert");
	}
	//전체출력하기---------------------------------------------
	@RequestMapping("/list.sp")
	public ModelAndView list() {
		List<User> list=userService.listUser();
		return new ModelAndView("list","list",list);
		              //출력할파일명(list.jsp),request객체명(list),request에 담을 객체명(list)
		
	}
}





