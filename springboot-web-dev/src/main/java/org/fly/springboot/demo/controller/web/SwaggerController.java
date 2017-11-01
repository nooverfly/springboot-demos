package org.fly.springboot.demo.controller.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.fly.springboot.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by overfly on 2017/11/1.
 */
@RestController
@RequestMapping("/user")
public class SwaggerController {
    static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={"/getAll"}, method= RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="/insert", method=RequestMethod.GET)
    public String postUser(User user) {
        users.put(user.getUsername(), user);
        return "success";
    }
    @ApiOperation(value="获取用户详细信息", notes="根据url的username来获取用户详细信息")
    @ApiImplicitParam(name = "username", value = "用户名称", required = true, dataType = "String")
    @RequestMapping(value="/getOne/{username}", method=RequestMethod.GET)
    public User getUser(@PathVariable String username) {
        return users.get(username);
    }

    @ApiOperation(value="更新用户详细信息", notes="根据url的username来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(value="/update/{username}", method=RequestMethod.GET)
    public String putUser(@PathVariable String username,User user) {
        User u = users.get(username);
        u.setAge(user.getAge());
        u.setAddress(user.getAddress());
        users.put(username, u);
        return "success";
    }
    @ApiOperation(value="删除用户", notes="根据url的username来指定删除对象")
    @ApiImplicitParam(name = "username", value = "用户名称", required = true, dataType = "String")
    @RequestMapping(value="/delete/{username}", method=RequestMethod.GET)
    public String deleteUser(@PathVariable String username) {
        users.remove(username);
        return "success";
    }
}
