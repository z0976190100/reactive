package com.crm.reactive.controller;

import com.crm.reactive.persistence.entity.User;
import com.crm.reactive.persistence.repo.UserRepo;
import com.crm.reactive.service.util.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    String saveUser(Model model, @RequestBody User user) {
        userService.saveUser(user);
        return "/index";
    }
}
