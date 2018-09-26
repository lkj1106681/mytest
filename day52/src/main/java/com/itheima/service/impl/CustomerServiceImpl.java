package com.itheima.service.impl;

import com.itheima.CustomerDao;
import com.itheima.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {

    @Value("20")
    private int id;
    @Value("小姐")
    private String name;
    @Autowired
    //@Qualifier("customerDao2")

    private CustomerDao customerDao1;

    /*public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
*/
    public void saveCustomer() {

        System.out.println("id: "+id+",name: "+name);

        customerDao1.saveCustomer();

    }

    @PostConstruct
    public void init(){
        System.out.println("正在执行初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("正在执行销毁");
    }


}
