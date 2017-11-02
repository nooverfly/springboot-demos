package org.fly.springboot.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by overfly on 2017/11/2.
 */
@Component
public class SchedulerTaskService {

    private int count=0;

    @Scheduled(cron = "*/3 * * * * ?")
    public void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
