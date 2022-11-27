package com.todo.todospring.controller;

import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.service.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private MemberRegService memberService;

    @GetMapping
    public String getRegisterForm(){
        return "login/memberRegisterForm";
    }

    @PostMapping
    public String register(MemberDTO dto, HttpServletRequest request){

        memberService.memberReg(dto, request);

        return "redirect:/index";
    }





}
