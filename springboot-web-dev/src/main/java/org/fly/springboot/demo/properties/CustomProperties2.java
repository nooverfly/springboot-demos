package org.fly.springboot.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by overfly on 2017/10/31.
 */
@Component
public class CustomProperties2 {

    @Value("${custom.prop.desc}")
    private String desc;
    @Value("${custom.prop.value}")
    private String value;
    @Value("${custom.prop.number}")
    private Integer number;
    @Value("${custom.prop.bignumber}")
    private Long bignumber;
    @Value("${custom.prop.test1}")
    private Integer test1;
    @Value("${custom.prop.test2}")
    private Integer test2;
    @Value("${custom.prop.test3}")
    private String test3;
    //@Value("${custom.prop.hobby[0],custom.prop.hobby[1]}")
    //这种方式下如何注入List
    private List<String> hobby;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }
}
