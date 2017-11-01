package org.fly.springboot.demo.domain;

/**
 * Created by overfly on 2017/11/1.
 */
public class User {

    private String username;
    private Integer id;
    private Integer age;

    public User() {}

    public User(Integer id,String username, Integer age) {
        this.id=id;
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
