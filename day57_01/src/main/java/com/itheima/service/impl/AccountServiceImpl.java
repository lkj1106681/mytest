package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.model.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    public List<Account> findAllAccount() {
        return accountDao.findAllAccounts();
    }


    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
