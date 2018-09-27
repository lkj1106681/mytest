package com.itheima.dao;

import com.itheima.model.Account;

import java.util.List;

public interface AccountDao {
    List<Account>findAllAccounts();

    void saveAccount(Account account);

}
