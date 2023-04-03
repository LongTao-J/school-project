package com.school.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @ClassName LoginController
 * @Author 龙涛05664416459
 * @Date 2023/4/3 17:04
 **/
@RestController
@RequestMapping("/test")
public class LoginController {
    @GetMapping("/test1")
    public String  test1(){
        return"OK1，successful！！！";
    }
}
