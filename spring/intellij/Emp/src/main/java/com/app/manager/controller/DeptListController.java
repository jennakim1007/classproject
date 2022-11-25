package com.app.manager.controller;

import com.app.manager.service.DeptListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/list")
public class DeptListController {

    @Autowired
    private DeptListService deptListService;

    @GetMapping
    public void getListForm(Model model){
        model.addAttribute("deptList", deptListService.getList());
    }



}
