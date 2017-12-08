package test04;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

//전체검색(select)
public class JdbcExample1 {
	public static void main(String[] args) {
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		                                               // 이름공간.id명
		List<GoodsEntity> goodsList=session.selectList("mybatis.goodsMapper.listGoods");
		System.out.println("   상품코드     상품명 \t\t  가격   \t제조사");
		System.out.println("-------------------------------------------------------");
		for(GoodsEntity entity : goodsList)
		{
			System.out.print("코드 : " + entity.getCode() +"\t");
			System.out.print("책이름 : " + entity.getName() +"\t");
			System.out.print("가격 : " + entity.getPrice() +"\t");
			System.out.print("출판사 : " + entity.getMaker() +"\n");
		}		
		session.close();
	}
}







