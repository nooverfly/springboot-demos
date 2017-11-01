package org.fly.springboot.demo.servicetest;

import org.fly.springboot.demo.service.SynService;
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
public class SynServiceTest {

    @Autowired
    private SynService synService;

    @Test
    public void testSyn() throws Exception {
        synService.doTaskOne();
        synService.doTaskTwo();
        synService.doTaskThree();
    }
}
