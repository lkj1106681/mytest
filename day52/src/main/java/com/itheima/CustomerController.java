package com.itheima;

import com.itheima.factory.BeanFactory;
import com.itheima.service.CustomerService;
import com.itheima.service.impl.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerController {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:bean.xml");
        CustomerService customerService=(CustomerService)context.getBean("customerService");
        customerService.saveCustomer();

        context.close();
		
		System.out.println("====master====");
		System.out.println("====dev====");

1111


    }
}
