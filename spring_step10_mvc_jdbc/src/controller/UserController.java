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
	//�߰��ϱ�(ȭ��)------------------------------------------
	@RequestMapping("/insert.sp")
	public ModelAndView insert() {
		return new ModelAndView("insert");
	}
	//�߰��ϱ�(����Ͻ�����)-------------------------------------
	@RequestMapping(value="/insertProc.sp",method=RequestMethod.POST)
	public ModelAndView insertProc(@ModelAttribute User user){
		//System.out.println("�̸�:"+user.getName());
		
		if(userService.insertUser(user)==true)
			return list();
		else
			return new ModelAndView("insert");
	}
	//��ü����ϱ�---------------------------------------------
	@RequestMapping("/list.sp")
	public ModelAndView list() {
		List<User> list=userService.listUser();
		return new ModelAndView("list","list",list);
		              //��������ϸ�(list.jsp),request��ü��(list),request�� ���� ��ü��(list)
		
	}
}





