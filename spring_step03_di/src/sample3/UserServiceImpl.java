package sample3;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		super();
		System.out.println("UserService ������ ȣ��");
	}

	@Override
	public void addUser(UserVO vo) {
		System.out.println("UserService : addUser() �޼ҵ� ȣ��");
		System.out.println("�̸�  : "+vo.getUserName());
	}

}
