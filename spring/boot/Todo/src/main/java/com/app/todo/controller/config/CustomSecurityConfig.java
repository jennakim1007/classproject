package com.app.todo.controller.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Log4j2
@Configuration
public class CustomSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // 0. CSRF 비활성화 -> 403 error
        http.csrf().disable();

        // 1. 권한에 따른 접속 경로 설정
        http.authorizeHttpRequests()
                .antMatchers("/todo/**").hasRole("USER")
                .anyRequest().permitAll();

        // 2. 기본 로그인 폼 설정
        http.formLogin().loginPage("/auth/login");

        return http.build();

    }

}
