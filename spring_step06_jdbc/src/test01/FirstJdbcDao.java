package test01;

public interface FirstJdbcDao {
	public void execute(String sql);          //��ü���
	public int insert(String code,String name, int price, String maker); //�߰��ϱ�
	public int delete(String name);          //�����ϱ�
}
