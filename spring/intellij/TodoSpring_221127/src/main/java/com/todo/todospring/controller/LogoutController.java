package com.todo.todospring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Log4j2
@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession session){
        log.info("LogoutController logout()...");
        session.invalidate();
        return "redirect:/index.jsp";
    }

}
