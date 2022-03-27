package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.boot.Banner;
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
        bankAccountList.add(new BankAccount("Simba", 2000, "lion",true));
        bankAccountList.add(new BankAccount("Sukari", 3000, "zebra",false));
        bankAccountList.add(new BankAccount("Timon", 1000, "suricate",false));
        bankAccountList.add(new BankAccount("Pumba", 1500, "warthog",false));
        bankAccountList.add(new BankAccount("Mufasa", 5000, "lion",true));
    }


    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(Model model){

        model.addAttribute("accounts",bankAccountList);
        return "index";
    }

    @RequestMapping (value = "/end",method = RequestMethod.GET)
    public String end(Model model){
        model.addAttribute("atribute" ,
                "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "end";
    }

}
