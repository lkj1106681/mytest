package com.itheima;

import com.itheima.model.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/list.do")
    public ModelAndView list(){
        ModelAndView mav=new ModelAndView();
        List<Account>list=accountService.findAllAccount();
        mav.addObject("accountList",list);

        mav.setViewName("list");

        return mav;
    }

    @RequestMapping("/add.do")
    public String add(){
        return "add";
    }

    @RequestMapping("/saveAccount.do")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "redirect:list.do";
    }
}
