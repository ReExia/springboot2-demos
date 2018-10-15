package com.example.resolver.controller;

import com.example.resolver.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author setsuna
 */
@Controller
public class IndexController {

    @RequestMapping("/myException")
    public String myException(){
        throw new MyException("自定义异常");
    }

    @RequestMapping("/exception")
    public String exception(){
        throw new RuntimeException("异常");
    }

}
