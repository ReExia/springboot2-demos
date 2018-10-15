package com.example.resolver.config;

import com.example.resolver.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author setsuna
 */
@ControllerAdvice
public class WebExceptionResolver {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object resolveException(Exception e){
        //1.异常类型为自定义异常
        if (e instanceof MyException){
            return e.getMessage();
        }
        //2.其他类型异常
        return "其他异常";
    }
}
