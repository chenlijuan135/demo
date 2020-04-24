package com.vanke.demo.controller;


import com.vanke.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    PersonServiceImpl personServiceImpl;

    @GetMapping("/world")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/mysql")
    public String code(){
        return personServiceImpl.ofCode("ROLE_MJ_CITY_ADMIN").getRoleName();
    }

    @GetMapping("/redis")
    public String redisCon(){
        return personServiceImpl.redis();
    }
}
