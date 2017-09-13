package de.cosmicit.pms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {


    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String getHomePage(Model model, HttpServletRequest request) {

        return "homePage";
    }

    @RequestMapping(value="/home/user", method= RequestMethod.GET)
    public String userHome(Model model, HttpServletRequest request) {

        return "userHome";
    }


    @RequestMapping(value="/home/agent", method= RequestMethod.GET)
    public String agentHome(Model model, HttpServletRequest request) {

        return "agentHome";
    }


}
