package com.todo.todospring.controller;

import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Member;

@Controller
@Log4j2
@RequestMapping("/register")
public class MemberInsertController {

    private final MemberService memberService;

    public MemberInsertController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public String getRegisterForm(){
        return "login/memberRegisterForm";
    }

    @PostMapping
    public String register(MemberDTO dto, HttpServletRequest request) throws Exception {
        log.info(dto);
        log.info(request);

        memberService.memberReg(dto, request);

        return "redirect:/index";
    }





}
