package customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import customer.dao.CustomerDAO;
import customer.vo.CustomerVO;

@Controller
public class CustomerSelect {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping("/customerSelect.do")
	public ModelAndView select() {
		List<CustomerVO> list = dao.select();
		ModelAndView mav = new ModelAndView("customer/list", "list", list);
		return mav;
	}
}
