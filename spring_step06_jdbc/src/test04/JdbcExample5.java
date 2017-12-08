package test04;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//[����] p0001��   ��������, 38000 �����ͽ��� �����Ͻÿ�
//
//[���] ��ǰ 1���� �����Ͽ����ϴ�
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
				System.out.println("��ǰ " + count +"���� �����Ͽ����ϴ�");
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
