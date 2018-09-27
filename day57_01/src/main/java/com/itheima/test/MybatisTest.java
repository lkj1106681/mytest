package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.model.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {

public static void main(String[]args) throws Exception{

    InputStream inputStream= Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
    SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();

    SqlSessionFactory sqlSessionFactory=builder.build(inputStream);

    SqlSession sqlSession=sqlSessionFactory.openSession();

    AccountDao mapper=sqlSession.getMapper(AccountDao.class);

    List<Account>list=mapper.findAllAccounts();
    for(Account a:list){
        System.out.println(a);

    }

    sqlSession.close();


        }

}
