package test1;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 이름중 "둘" 자가 포함되어 있는 데이터 찾기
public class UserMain4 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		
		UserDaoImpl ob = (UserDaoImpl)factory.getBean("test1");

		List list=ob.selectSearch("둘");
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		((ClassPathXmlApplicationContext)factory).close();
	}
}
//[결과화면]
//{NO=1, NAME=둘리, ADDR=서울시 강서구 염창동, SAL=750000}
//{NO=2, NAME=강둘리, ADDR=서울시 강서구 목동, SAL=750000}
//{NO=3, NAME=둘리짱, ADDR=서울시 강서구 염창동, SAL=450000}