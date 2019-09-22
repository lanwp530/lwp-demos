package com.example.lwp.swagger2.swagger2authdemo.controller;

import com.example.lwp.swagger2.swagger2authdemo.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanwp
 * @Date 2019/9/17 7:55
 */
@RestController
@RequestMapping("/test")
@Api(tags = {"test模块"}, description = "controller描述") //
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation("hello入口")
    public String hello(String username){
        return "hello " + username;
    }

    @GetMapping("/hello1")
    public String hello1(String username){
        return "hello1 " + username;
    }

    @PostMapping("/helloUser")
    @ApiOperation("hello user 用户对象接口")
    public User helloUser(User user){
        System.out.println("hello " + user.toString());
        return user;
    }
}
