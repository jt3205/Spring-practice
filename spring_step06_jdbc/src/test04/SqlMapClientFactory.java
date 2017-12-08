package test04;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapClientFactory {
	
	private static SqlSessionFactory  factory=null;
	
	static {
		try {
			String resource="test04/mybatis-config.xml";
			Reader reader=Resources.getResourceAsReader(resource);
			//factory=new SqlSessionFactoryBuilder().build(reader, "dev");
			factory=new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//------------------------------------------------------------------
	public static SqlSessionFactory getSqlMapClientInstance(){
		return factory;
	}
}









