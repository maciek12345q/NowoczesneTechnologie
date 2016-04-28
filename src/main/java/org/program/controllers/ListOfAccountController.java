package org.program.controllers;

import org.program.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by maciu on 26.04.2016.
 */

@Controller
public class ListOfAccountController {

    @Autowired
    LoginService loginService;

    public void setLoginService(LoginService loginService)
    {
        this.loginService = loginService;
    }

    public LoginService getLoginService()
    {
        return this.loginService;
    }


    @RequestMapping(value="/forms/listOfAccount.html",method= RequestMethod.GET)
    public String showListOfAccountForm()
    {
        return "listOfAccount";
    }


    @RequestMapping(value="/forms/listOfAccount.html",method = RequestMethod.POST)
    public String processListOfAccountForm(Map model)
    {
        List<String> list = loginService.listOfAccount();


        model.put("lists",list);
       return "listOfAccount";


    }


}
