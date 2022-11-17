package com.firstcoding.mvc.todo.controller;

import com.firstcoding.mvc.todo.domain.MemberDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/login") // 기본 경로 매핑
public class LoginController {

    @GetMapping
    public String getLoginForm(){
        return "login/form";
    }

    @PostMapping
    public String login(
            @ModelAttribute("req")MemberDTO memberDTO
            ){
        log.info("memberDTO => " + memberDTO);
        return "login/login";
    }

}
