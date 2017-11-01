package org.fly.springboot.demo.controller;

import org.fly.springboot.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by overfly on 2017/11/1.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("greeting","hello thymeleaf");
        modelMap.addAttribute("login","fly");
        List<User> users = new ArrayList<User>(3);
        users.add(new User("fly",18,"hz"));
        users.add(new User("admin",18,"CN"));
        users.add(new User("client",18,"USA"));
        modelMap.addAttribute("users",users);
        return "index";
    }

    @RequestMapping("/Bootstrapdemo")
    public String bootstrapdemo(){
        return "Bootstrapdemo";
    }
}
