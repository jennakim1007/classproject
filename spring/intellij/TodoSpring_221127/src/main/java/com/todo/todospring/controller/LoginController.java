package com.todo.todospring.controller;

import com.todo.todospring.domain.MemberDTO;
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
import java.lang.reflect.Member;

@Log4j2
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String getLoginForm(){
        log.info("LoginController getLoginForm()...");
        return "login/loginForm";
    }

    @PostMapping
    public String login(@RequestParam("uid") String uid, @RequestParam("pw")String pw, HttpServletRequest request){
        log.info("LoginController login()...");

        MemberDTO dto = loginService.login(uid, pw);

        if(dto!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("loginInfo", dto.toLoginInfo());
        }

        return "redirect:/index.jsp";

    }


}
