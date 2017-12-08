package test04;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//추가하기(insert)
public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test04/beans.xml");
		
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		GoodsEntity entity=(GoodsEntity)factory.getBean("entity1");
		
		try {
			int count=session.insert("mybatis.goodsMapper.insertGoods", entity);
			if(count > 0) {
				session.commit();
				System.out.println(count + "행의 데이타가 입력 되었습니다");
			}
		}catch(Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		((ClassPathXmlApplicationContext)factory).close();
	}
}





