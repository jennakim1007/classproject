package com.app.manager.controller;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.DeptRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/register")
public class DeptRegController {

    @Autowired
    private DeptRegService deptRegService;

    @GetMapping
    public void getRegisterForm(){}

    @PostMapping
    public String register(DeptDTO deptDTO){
        deptRegService.register(deptDTO);
        return "redirect:/dept/list";
    }


}
