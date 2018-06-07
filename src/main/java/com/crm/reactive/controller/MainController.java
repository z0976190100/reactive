package com.crm.reactive.controller;

import com.crm.reactive.persistence.repo.UserRepo;
import com.crm.reactive.service.util.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

@GetMapping
    String index(){
    return "index";
}


}
