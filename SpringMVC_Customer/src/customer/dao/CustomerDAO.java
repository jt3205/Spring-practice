package customer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.vo.CustomerVO;

@Service
public class CustomerDAO {
	@Autowired
	private SqlSessionFactory factory;

	public String insert(CustomerVO vo) {
		String result = null;

		try {
			int n = factory.openSession().insert("customer.insertCustomer", vo);
			if (n > 0) result = vo.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<CustomerVO> select() {
		List<CustomerVO> list = null;
		try {
			list = factory.openSession().selectList("customer.selectCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public CustomerVO searchCustomer(String vo) {
		CustomerVO vo1 = null;
		try {
			vo1 = factory.openSession().selectOne("customer.searchCustomer", vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo1;
	}

}
