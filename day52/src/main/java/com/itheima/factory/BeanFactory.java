package com.itheima.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private static BeanFactory beanFactory;
    private BeanFactory(){

    }

    private static Properties pro;

    static{
        try {
            beanFactory=new BeanFactory();

            pro=new Properties();

            InputStream inputStream=BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");

            pro.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static BeanFactory getBeanFactory(){
        return beanFactory;

    }


   /* public CustomerDao getCustomerDao(){
        return new CustomerDaoImpl();
    }*/

    public Object getBean(String beanName){
        Object obj=null;
        String className=pro.getProperty(beanName);

        try {

             obj=Class.forName(className).newInstance();
        } catch (Exception e) {
            System.out.println("实例化对象失败:"+className);
            e.printStackTrace();
        }
        return obj;
    }
}
