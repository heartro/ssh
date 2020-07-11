package com.zhangwei.controller;

import com.zhangwei.entity.User;
import com.zhangwei.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        System.out.println("test1");
        return "Hello SpringMVC";
    }

    @GetMapping("/test2")
    @ResponseBody
    public List<User> test2() {
        return indexService.getUserAll();
    }

    @GetMapping("/test3")
    @ResponseBody
    public String test3() {
        User user = new User("王五", "wangwu", "123456", new Date());
        indexService.addUser(user);
        return user.toString();
    }

    @Autowired
    private IndexService indexService;
}
