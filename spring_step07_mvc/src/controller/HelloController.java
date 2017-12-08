package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="hello.sp")
	public String hello(Model model) {
		model.addAttribute("message", "Hello Spring MVC");
		return "/WEB-INF/view/hello.jsp";
	}
}
