package test04;

import org.apache.ibatis.session.SqlSession;

//�̸����� ����
public class JdbcExample4 {
	public static void main(String[] args) {
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		try {
			int count = session.delete("mybatis.goodsMapper.deleteGoods", args[0]);
			if (count > 0) {
				session.commit();
				System.out.println(args[0] + "���簡 " + count + "�� �����Ǿ����ϴ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
