package test02;

import java.util.List;

public interface FirstJdbcDao {
	public List<GoodsEntity> listGoods();
	public GoodsEntity findGoods(String code);
	public int update(String name, int price, String maker, String code);
}
