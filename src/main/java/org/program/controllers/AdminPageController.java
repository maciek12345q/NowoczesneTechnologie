package org.program.controllers;

import org.program.service.LoginService;
import org.program.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by maciu on 28.04.2016.
 */

/*
TODO
Usuwanie uzytkownikow i przypomnienie o hasle
 */


@Controller
public class AdminPageController {

    @Autowired
    LoginService loginService;

    @Autowired
    RegistrationService registrationService;

    private void setRegistrationService(RegistrationService registrationService)
    {
        this.registrationService = registrationService;
    }

    private void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    private LoginService getLoginService() {
        return this.loginService;
    }


    @RequestMapping(value = "/admin_panel", method = RequestMethod.GET)
    public String showAdminPage(Map model, @RequestParam(value = "usun", required = false) Integer usun,
                                @RequestParam(value = "wyslij", required = false) Integer wyslij,
                                @RequestParam(value = "edytuj", required = false) Integer edytuj,
                                @RequestParam(value="id",required = false)Long id) {
        List<String> list = loginService.listOfAccount();
        if (usun == null && edytuj == null && wyslij == null) {



            model.put("lists", list);
            return "adminPage";
        } else if(usun !=null ){
            this.registrationService.removeAccount(id);
            return "adminPage";
        }
        else if(edytuj  !=  null)
        {
        model.put("list",list);
         return "editAccountPage";
        }


        else
        {
            return "403";
        }

    }
}
