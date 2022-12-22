package com.app.todo.controller.auth;

import com.app.todo.domain.MemberRequest;
import com.app.todo.security.CustomUserDetailService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/auth/register")
public class MemberInsertController {

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @GetMapping
    public void getRegisterForm(){

    }

    @PostMapping
    public String insertMember(MemberRequest memberRequest){

        log.info("memberRequest......" + memberRequest);
        customUserDetailService.save(memberRequest);

        return "redirect:/auth/login";

    }

}
