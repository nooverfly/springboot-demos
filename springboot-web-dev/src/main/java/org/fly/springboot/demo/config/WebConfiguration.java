package org.fly.springboot.demo.config;

import org.fly.springboot.demo.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by overfly on 2017/10/31.
 */
@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new CustomFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("paramName","paramValue");
        filterRegistrationBean.setName("customFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
