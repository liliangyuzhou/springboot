package com.cmbt.demo.controller;

import com.cmbt.demo.model.User;
import com.cmbt.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }

    @ResponseBody //加了此注解就不会通过模板返回
    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable Integer userId) {
        User user = userService.getUser(userId);
        return user;
    }

    @GetMapping(value = "/hello")
    public String hello(Model model) {
        logger.info("logback 访问hello");
        logger.error("logback 访问hello");

        String name = "hello aaa";
        model.addAttribute("name", name);
        return "hello";
    }
}
