//package com.wzf.cloud.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @Author: wenzf
// * @Date 2021-10-15
// * @Description:
// */
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().ignoringAntMatchers("/eureka/**");//配置/eureka/**路径不需要CSRF token
//        super.configure(http);
//    }
//}
