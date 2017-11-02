package org.fly.springboot.demo;

import org.fly.springboot.demo.domain.User;
import org.fly.springboot.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by overfly on 2017/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        userRepository.save(new User("fly",18));
        userRepository.save(new User("admin",28));
        userRepository.save(new User("client",8));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(3, userRepository.findAll().size());
        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(new Integer(18), userRepository.findByUsername("fly").getAge());
        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(28, userRepository.findUser("admin").getAge().longValue());
        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("client", userRepository.findByUsernameAndAge("client",8).getUsername());
        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByUsername("client"));
        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(2, userRepository.findAll().size());
    }

    //测试分页查询
    @Test
    public void testPage(){
        int page=0,size=10;
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page, size, sort);
        Page<User> users = userRepository.findAll(pageable);
        List<User> userList = users.getContent();
        System.out.println(userList);
    }

    //测试限制查询
    public void testTop(){
        User user = userRepository.findTopByAge();
        System.out.println(user);
    }
}
