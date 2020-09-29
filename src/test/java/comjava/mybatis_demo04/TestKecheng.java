package comjava.mybatis_demo04;


import com.github.pagehelper.PageHelper;
import comjava.mybatis_demo04.dao.KechengDao;
import comjava.mybatis_demo04.daomain.Kecheng;
import comjava.mybatis_demo04.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestKecheng {


    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        KechengDao mapper = sqlSession.getMapper(KechengDao.class);//mybatis的mapper代理对象
        PageHelper.startPage(1,2);//分页的使用
        List<Kecheng> kechengs = mapper.selectKekeng();
        System.out.println(kechengs);
    }
}
