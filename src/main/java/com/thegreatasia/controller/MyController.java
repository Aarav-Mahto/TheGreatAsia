package com.thegreatasia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    
    @GetMapping({"/","/index","/home"})
    public String getHome(){
        return "index";
    }
    @GetMapping({"/about","/aboutUs"})
    public String getAbout(){
        return "OptionalPages/about";
    }
    @GetMapping({"/contact","/contactUs"})
    public String getContact(){
        return "OptionalPages/contact";
    }
    @GetMapping({"/disclaimer"})
    public String getDisclaimer(){
        return "OptionalPages/disclimer";
    }
    @GetMapping({"/terms"})
    public String getTerms(){
        return "OptionalPages/terms";
    }
    @GetMapping({"/policy"})
    public String getpolicy(){
        return "OptionalPages/policy";
    }

}
