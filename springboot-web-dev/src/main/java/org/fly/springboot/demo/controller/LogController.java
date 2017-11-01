package org.fly.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by overfly on 2017/10/31.
 */
@RestController
public class LogController {

    private final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String home() {
        logger.info("logback 访问hello");
        logger.error("logback 访问hello");
        return "Hello World!";
    }
}
