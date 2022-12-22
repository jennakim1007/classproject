package com.app.todo.controller.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
                // .antMatchers("/todo/**").hasRole("USER")
                .anyRequest().permitAll();

        // 2. 기본 로그인 폼 설정
        // http.formLogin();
        http.formLogin().loginPage("/auth/login");

        // 3. 자동 로그인
        http.rememberMe().key("123456789").rememberMeParameter("remember").tokenValiditySeconds(60*60*60*24*7);

        // 4. 로그아웃 설정
        http.logout().logoutSuccessUrl("/");

        return http.build();

    }

    // 5. 비밀번호 암호화
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
