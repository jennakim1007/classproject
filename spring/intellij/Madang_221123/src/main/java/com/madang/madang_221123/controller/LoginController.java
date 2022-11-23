package com.madang.madang_221123.controller;

import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Log4j2
@Controller
@RequestMapping("customer/login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @GetMapping()
    public String getLoginForm(){
        return "/customer/loginForm";
    }

    @PostMapping
    public String login(@RequestParam("custid") int custid, @RequestParam("name") String name, HttpServletRequest request) throws SQLException {

        Customer customer = service.login(custid, name);

        if(customer!=null) {
            HttpSession session = request.getSession(true);
            session.setAttribute("customerInfo", customer);
        }

        return "redirect:/index";

    }


}
