package org.fly.springboot.demo.servicetest;

import org.fly.springboot.demo.service.ASynService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by overfly on 2017/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ASynServiceTest {

    @Autowired
    private ASynService aSynService;

    @Test
    public void testSyn() throws Exception {
        aSynService.doTaskOne();
        aSynService.doTaskTwo();
        aSynService.doTaskThree();
        Thread.sleep(2000);
    }
}
