package com.madang.madang_221123.controller;

import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.service.CustomerInsertService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Log4j2
@Controller
@RequestMapping("customer/register")
public class CustomerInsertController {

    private final CustomerInsertService service;

    public CustomerInsertController(CustomerInsertService service) {
        this.service = service;
    }

    @GetMapping
        public String getRegisterForm(){
        log.info("CustomerInsertController getRegisterForm()...");
        return "/customer/registerForm";
    }

    @PostMapping
    public String register(Customer customer) throws SQLException {
        log.info("CustomerInsertController register()...");
        service.customerRegister(customer);
        return "redirect:/index";
    }

}
