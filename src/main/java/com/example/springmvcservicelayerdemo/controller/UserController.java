package com.example.springmvcservicelayerdemo.controller;

import com.example.springmvcservicelayerdemo.model.User;
import com.example.springmvcservicelayerdemo.service.UserJpaService;
import com.example.springmvcservicelayerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;  // save data to list
    @Autowired
    UserJpaService userJpaService;   // save data to database

   @PostMapping("/adduser")
    public String action(Model model , @ModelAttribute User user) {
        System.out.println(user);
      //  userService.addUser(user);
        userJpaService.Add(user);
        return "index";
    }

    @GetMapping("/displayusers")
    public String action2( Model model ) {

      //  List<User> users = userService.getUsers();
        List<User> users = userJpaService.GetUsers();
        model.addAttribute("users", users);
        return "users";

    }
    @GetMapping("/deleteuser")
    public  String action( Model model, @RequestParam(required = false) int userId) {

      // userService.removeUser(userId);
       userJpaService.Delete(userId);
       List<User> users = userJpaService.GetUsers();
       model.addAttribute("users", users);
       return "users";
    }

    @GetMapping("/updateuser")
    public String action2( Model model, @RequestParam(required = false) int userId) {

       User user = new User();
       user.setId(userId);
       model.addAttribute("user", user);
       return "updateuser";
    }
}
