package org.fly.springboot.demo.controller;

import org.fly.springboot.demo.domain.ErrorInfo;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by overfly on 2017/11/1.
 */
@Controller
public class NotFoundController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = "/error")
    public Object error(HttpServletResponse response, HttpServletRequest request) {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage("not found");
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(request.getRequestURL().toString());
        return "404";

    }
}
