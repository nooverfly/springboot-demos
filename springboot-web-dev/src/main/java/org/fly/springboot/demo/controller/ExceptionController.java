package org.fly.springboot.demo.controller;

import org.fly.springboot.demo.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by overfly on 2017/11/1.
 */
@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception(){
        throw new RuntimeException("Some erros");
    }

    @RequestMapping("/customexception")
    public String customexception() throws CustomException {
        throw new CustomException("自定义异常");
    }
}
