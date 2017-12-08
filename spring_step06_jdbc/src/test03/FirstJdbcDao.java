package test03;

import java.util.List;

public interface FirstJdbcDao {
	public int insert(GoodsEntity entity);
	public void execute(String sql);
	public int delete(String name);
	public List<GoodsEntity> listGoods();
	public GoodsEntity findGoods(String code);
	public int updateGoods(GoodsEntity entity);
}
