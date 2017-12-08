package test04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//복수 조건으로 검색
//[문제] 코드에  "p0"가 포함되어 있으며, 금액이 25000원을 초과하고, 출판사가 "인포믹스"
//상품을 검색하시오
public class JdbcExample6 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("code",  "%" + "p0" + "%");
		map.put("price", 25000);
		map.put("maker", "인포믹스");
		
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		List<GoodsEntity> goodsList=session.selectList("mybatis.goodsMapper.selectGoodsByCodeAndPriceAndMaker", map);
		System.out.println("   상품코드     상품명 \t\t  가격   \t제조사");
		System.out.println("-------------------------------------------------------");
		for(GoodsEntity entity : goodsList)
		{
			System.out.print("코드 : " + entity.getCode() +"\t");
			System.out.print("책이름 : " + entity.getName() +"\t");
			System.out.print("가격 : " + entity.getPrice() +"\t");
			System.out.print("출판사 : " + entity.getMaker() +"\n");
		}
	}
}





