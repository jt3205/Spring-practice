package customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import customer.dao.CustomerDAO;
import customer.vo.CustomerVO;

@Controller
public class CustomerInsert {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping("/customerInsert.do")
	public ModelAndView insert(CustomerVO vo) {
		String result = dao.insert(vo);
		ModelAndView mav = new ModelAndView("customer/result", "result", result);
		return mav;
	}
}
