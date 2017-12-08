package test01;

public interface FirstJdbcDao {
	public void execute(String sql);          //전체출력
	public int insert(String code,String name, int price, String maker); //추가하기
	public int delete(String name);          //삭제하기
}
