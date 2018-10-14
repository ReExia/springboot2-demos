package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author setsuna
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello";
    }

}
