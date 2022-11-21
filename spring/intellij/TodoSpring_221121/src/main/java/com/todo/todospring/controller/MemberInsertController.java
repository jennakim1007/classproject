package com.todo.todospring.controller;

import com.todo.todospring.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/login/memberRegisterForm")
public class MemberInsertController {

    private final MemberService memberService;

    public MemberInsertController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public void getRegisterForm(){}






}
