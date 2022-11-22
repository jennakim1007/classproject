package com.todo.todospring.controller;

import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;

@Log4j2
@Controller
@RequestMapping("/login")
public class LoginController {

    private final MemberService memberService;


    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public String getLoginForm(){
        log.info("LoginController getLoginForm()...");
        return "login/loginForm";
    }

    @PostMapping
    public String login(
            @RequestParam("uid") String uid,
            @RequestParam("pw")String pw,
            HttpServletRequest request
    ) throws Exception {
        log.info("LoginController login()...");

        MemberDTO dto = memberService.login(uid, pw);

        if(dto!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("loginInfo", dto.toLoginInfo());
        }

        return "redirect:/index.jsp";

    }


}
