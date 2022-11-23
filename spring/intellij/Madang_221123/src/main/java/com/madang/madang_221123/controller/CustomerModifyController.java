package com.madang.madang_221123.controller;

import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.service.CustomerModifyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("customer/modify")
public class CustomerModifyController {

    private final CustomerModifyService service;

    public CustomerModifyController(CustomerModifyService service) {
        this.service = service;
    }

    @GetMapping
    public String getModifyForm(){
        return "customer/modifyForm";
    }

    @PostMapping
    public String modify(Model model, Customer customer) throws SQLException {

        service.customerModify(customer);

        return "redirect:/index";
    }



}
