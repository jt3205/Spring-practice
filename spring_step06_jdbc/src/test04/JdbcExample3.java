package test04;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//코드로 찾기
public class JdbcExample3 {
	public static void main(String[] args) {
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		GoodsEntity entity=session.selectOne("mybatis.goodsMapper.findsGoods", args[0]);
		System.out.println(entity.getCode()+"    " +entity.getName() +"   "
                + entity.getPrice() + "    " + entity.getMaker());		

		session.close();
	}
}
