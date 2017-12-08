package test04;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

//��ü�˻�(select)
public class JdbcExample1 {
	public static void main(String[] args) {
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		                                               // �̸�����.id��
		List<GoodsEntity> goodsList=session.selectList("mybatis.goodsMapper.listGoods");
		System.out.println("   ��ǰ�ڵ�     ��ǰ�� \t\t  ����   \t������");
		System.out.println("-------------------------------------------------------");
		for(GoodsEntity entity : goodsList)
		{
			System.out.print("�ڵ� : " + entity.getCode() +"\t");
			System.out.print("å�̸� : " + entity.getName() +"\t");
			System.out.print("���� : " + entity.getPrice() +"\t");
			System.out.print("���ǻ� : " + entity.getMaker() +"\n");
		}		
		session.close();
	}
}







