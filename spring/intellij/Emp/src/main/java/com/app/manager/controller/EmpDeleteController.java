package com.app.manager.controller;

import com.app.manager.service.EmpDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp/delete")
public class EmpDeleteController {

    @Autowired
    private EmpDeleteService empDeleteService;

    @GetMapping
    public String delete(@RequestParam("empno") int empno){
        empDeleteService.delete(empno);
        return "redirect:/emp/list";
    }


}
