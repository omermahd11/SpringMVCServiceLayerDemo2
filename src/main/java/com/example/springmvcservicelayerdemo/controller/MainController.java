package com.example.springmvcservicelayerdemo.controller;

import com.example.springmvcservicelayerdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/app")
    public String action(){

        return "index";
    }

    @GetMapping("/newuserpage")
    public String action2( Model model ){
       User user = new User(200, "Jane" , 34);
       model.addAttribute("user", user);
        return "page2";
    }
}
