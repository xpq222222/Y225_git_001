package cn.bdqn.controller;

import cn.bdqn.domin.Account;
import cn.bdqn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping(value = "/acountList")
    public String login(Model model){
        List<Account> accounts = accountService.queryAll();
        model.addAttribute("list",accounts);
        return "main";
    }
}
