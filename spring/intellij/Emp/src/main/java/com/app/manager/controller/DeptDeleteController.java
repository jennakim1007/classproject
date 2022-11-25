package com.app.manager.controller;

import com.app.manager.service.DeptDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dept/delete")
public class DeptDeleteController {

    @Autowired
    private DeptDeleteService deptDeleteService;

    @GetMapping
    public String deleteDeptByDeptno(@RequestParam("deptno") int deptno){
        deptDeleteService.deleteDept(deptno);
        return "redirect:/dept/list";
    }





}
