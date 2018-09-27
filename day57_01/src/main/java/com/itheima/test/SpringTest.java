package com.itheima.test;

import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        AccountService accountService=(AccountService)context.getBean("accountService");

        accountService.findAllAccount();
    }

}
