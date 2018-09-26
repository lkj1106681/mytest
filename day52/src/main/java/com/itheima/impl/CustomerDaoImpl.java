package com.itheima.impl;

import com.itheima.CustomerDao;
import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    public void saveCustomer() {
        System.out.println("保存客户成功");
    }
}
