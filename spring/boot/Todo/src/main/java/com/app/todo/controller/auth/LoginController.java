package com.app.todo.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/auth/login")
    public void getLoginForm(){

    }

}
