package test04;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//[문제] p0001를   제이쿼리, 38000 인포믹스로 변경하시오
//
//[결과] 상품 1개를 수정하였습니다
public class JdbcExample5 {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("test04/beans.xml");
		
		GoodsEntity entity=factory.getBean("entity2", GoodsEntity.class);		
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		try{
			int count=session.insert("mybatis.goodsMapper.updateGoods", entity);
			if(count > 0)
			{
				session.commit();
				System.out.println("상품 " + count +"개를 수정하였습니다");
			}
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
