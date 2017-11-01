package org.fly.springboot.demo.controller;

import org.fly.springboot.demo.domain.User;
import org.fly.springboot.demo.properties.CustomProperties;
import org.fly.springboot.demo.properties.CustomProperties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by overfly on 2017/10/31.
 */
@RestController
public class JsonController {

    @Autowired
    private CustomProperties customProperties;
    @Autowired
    private CustomProperties2 customProperties2;

    @RequestMapping("/getList")
    public List<String> getList(){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("springboot");

        return list;
    }

    @RequestMapping("/getMap")
    public Map<String,User> getMap(){
        Map<String,User> map = new HashMap<String,User>();
        User user1 = new User("fly",18,"hangzhou");
        map.put("user1",user1);
        User user2 = new User("test",18,"China");
        map.put("user2",user2);

        return map;
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User("fly",18,"hangzhou");
        return user;
    }

    @RequestMapping("/getProperties")
    public String getProperties(){
        String name = customProperties.getName();
        Integer age = customProperties.getAge();
        List<String> hobby = customProperties.getHobby();
        return "name is "+name+",age is "+age+",hobbies are "+hobby.toString();
    }

    @RequestMapping("/getProperties2")
    public String getProperties2(){
        String desc = customProperties2.getDesc();
        String value = customProperties2.getValue();
        Integer number = customProperties2.getNumber();
        Long bignumber = customProperties2.getBignumber();
        Integer test1 = customProperties2.getTest1();
        Integer test2 = customProperties2.getTest2();
        String test3 = customProperties2.getTest3();
        return desc+","+value+","+number+","+bignumber+","+test1+","+test2+","+test3;
    }
}
