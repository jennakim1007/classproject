package com.app.manager.controller;

import com.app.manager.domain.EmpDTO;
import com.app.manager.service.EmpRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp/register")
public class EmpRegController {

    @Autowired
    private EmpRegService empRegService;

    @GetMapping
    public void getRegForm(){
    }

    @PostMapping
    public String register(EmpDTO empDTO){
        empRegService.register(empDTO);
        return "redirect:/emp/list";
    }


}
