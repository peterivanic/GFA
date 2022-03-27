package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    private List<BankAccount> bankAccountList = new ArrayList<>();

    public BankAccountController(){
        bankAccountList.add(new BankAccount("Simba", 2000, "lion"));
        bankAccountList.add(new BankAccount("Zeb", 3000, "zebra"));
    }


    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(Model model){

        model.addAttribute("accounts",bankAccountList);
        return "index";
    }

}
