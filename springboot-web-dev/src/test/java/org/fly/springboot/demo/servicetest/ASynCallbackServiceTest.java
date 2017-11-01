package org.fly.springboot.demo.servicetest;

import org.fly.springboot.demo.service.ASynCallbackService;
import org.fly.springboot.demo.service.ASynService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

/**
 * Created by overfly on 2017/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ASynCallbackServiceTest {

    @Autowired
    private ASynCallbackService aSynCallbackService;

    @Test
    public void testSyn() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> taskOne = aSynCallbackService.doTaskOne();
        Future<String> taskTwo = aSynCallbackService.doTaskTwo();
        Future<String> taskThree = aSynCallbackService.doTaskThree();
        while (true){
            if (taskOne.isDone()&&taskTwo.isDone()&&taskThree.isDone()){
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}
