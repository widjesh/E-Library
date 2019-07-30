package com.software.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String displayHomepage(){
        return "Home/index";
    }

    @RequestMapping(value = "/home/about", method = RequestMethod.GET)
    public String displayAboutpage(){
        return "Home/about";
    }
}
