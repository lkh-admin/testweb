package com.example.testweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/word")
    public  String loginC(){
        System.out.println("输出word");
        return "word";
    }
}
