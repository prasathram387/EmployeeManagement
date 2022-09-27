package com.i2i.employee.controller;

import com.i2i.employee.service.MyUserDetailsService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

    MyUserDetailsService myUserDetailsService;
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

        authenticationManagerBuilder.userDetailsService(myUserDetailsService) {
    }
}
