package test04;

import org.apache.ibatis.session.SqlSession;

//이름으로 삭제
public class JdbcExample4 {
	public static void main(String[] args) {
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		try {
			int count = session.delete("mybatis.goodsMapper.deleteGoods", args[0]);
			if (count > 0) {
				session.commit();
				System.out.println(args[0] + "교재가 " + count + "개 삭제되었습니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
	}
}
