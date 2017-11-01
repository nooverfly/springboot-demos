package org.fly.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by overfly on 2017/10/31.
 */
@SpringBootApplication
@EnableAsync
public class WebdevApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebdevApplication.class,args);
    }
}
