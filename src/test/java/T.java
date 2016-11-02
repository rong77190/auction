//import com.auction.entity.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.junit.Test;
//
///**
// * Created by dell on 2016/7/20.
// */
//public class T {
//    @Test
//    public void test1(){
//        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//        String state = "com.auction.dao.UserMapper.selectByPrimaryKey";
//
//        User user = sqlSession.selectOne(state,1);
//        System.out.println(user);
//
//    }
//
//
//    @Test
//    public void test2(){
//        SqlSessionFactory sqlSessionFactory = MybatisUtils.getFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//        String state = "com.auction.dao.UserMapper.selectByPrimaryKey";
//
//        User user = sqlSession.selectOne(state,1);
//        System.out.println(user);
//
//    }
//
//
//}
