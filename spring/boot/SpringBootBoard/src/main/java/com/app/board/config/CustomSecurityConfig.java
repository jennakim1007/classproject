package com.app.board.config;

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

        http.csrf().disable();

        // 권한에 따른 접속 제한 설정
        /*
            USER : /board/**, /reply/**, /todo/**...
            ADMIN : /admin/**...
            나머지 요청 경로 : 모두 허가
        */
        http.authorizeHttpRequests()
                .antMatchers("/board/**", "/reply/**", "/todo/**").hasRole("USER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll();

        // form 로그인 페이지에 대한 설정, 성공시 처리 핸들러 등록(선택)
        // http.formLogin(); // security가 제공해주는 기본 로그인 폼
        http.formLogin().loginPage("/auth/login"); // 사용자가 직접 만든 로그인 폼

        // 로그아웃
        http.logout().logoutUrl("/auth/logout").logoutSuccessUrl("/"); // security가 자동 매핑

        // 자동 로그인
        http.rememberMe().key("123456789").rememberMeParameter("remember-me").tokenValiditySeconds(60*60*60*24*7); // 임의의 키 값 넣어줌

        return http.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }












}
