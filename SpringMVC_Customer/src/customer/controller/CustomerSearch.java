package customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import customer.dao.CustomerDAO;
import customer.vo.CustomerVO;

@Controller
public class CustomerSearch {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping("/customerSearch.do")
	public ModelAndView search(@RequestParam("id") String id) {
		CustomerVO vo1 = dao.searchCustomer(id);
		ModelAndView mav = new ModelAndView("customer/view", "vo", vo1);
		return mav;
	}
}
