package com.itheima.service;

import com.itheima.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllAccount();
    void saveAccount(Account account);

}
