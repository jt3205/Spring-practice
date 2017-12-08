package aop01;

public class Woman {
	public void classwork() {
		System.out.println("교실문을 연다");
		
		try {
			System.out.println("컴퓨터를 켜고 쇼핑 정보를 확인 한다");
		}catch(Exception e){
			System.out.println("수업 없는날");
		}finally {
			System.out.println("교실 안을 점검한다");
		}
		
		System.out.println("교실문을 잠근다");
	}
}
