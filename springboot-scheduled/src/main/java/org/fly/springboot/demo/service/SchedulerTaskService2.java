package org.fly.springboot.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by overfly on 2017/11/2.
 */
@Component
public class SchedulerTaskService2 {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void process(){
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
