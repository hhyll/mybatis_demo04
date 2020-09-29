package comjava.mybatis_demo04.dao;

import comjava.mybatis_demo04.daomain.Kecheng;

import java.util.List;

public interface KechengDao {


    //查询
    public List<Kecheng> selectKekeng();

    //插入
    public Integer insertKecheng(Kecheng kecheng);
}
