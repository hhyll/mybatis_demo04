package comjava.mybatis_demo04.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
   private static SqlSessionFactory factory=null;

    static {
        try {
            InputStream rs = Resources.getResourceAsStream("mybatis.xml");
             factory = new SqlSessionFactoryBuilder().build(rs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
       // SqlSession sqlSession = factory.openSession();
        return factory.openSession();
    }
}
