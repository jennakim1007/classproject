package com.todo.todospring.controller;

import com.todo.todospring.domain.Member;
import com.todo.todospring.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String loginForm(){
        return "loginForm";
    }

    @PostMapping
    public String login(
            @RequestParam("uid") String uid, // default : require = true 필수 입력값이 됨
            @RequestParam("pw") String pw,
            HttpServletRequest request
    ) throws Exception {

        Member member = loginService.login(uid, pw);

        // id와 pw 가 맞는 회원
        if(member != null){
            // 로그인 처리
            HttpSession session = request.getSession(true); // 세션 객체를 무조건 받아와야 하므로 (true) 혹은 () 처리
            session.setAttribute("loginInfo", member.toLoginInfo());
        }

        return "redirect:/index.jsp";

    }




}
