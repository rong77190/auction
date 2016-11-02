//import com.auction.entity.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//
///*
// * mybatis快速入门
// */
//public class Test {
//
//	public static void main(String[] args) throws IOException {
//		String resource = "conf.xml";
//		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
//
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//
//		SqlSession session = factory.openSession();
//
//		String statement = "com.auction.dao.UserMapper.selectByPrimaryKey";
//
//		User user = session.selectOne(statement, 1);
//		System.out.println(user);
//	}
//}
