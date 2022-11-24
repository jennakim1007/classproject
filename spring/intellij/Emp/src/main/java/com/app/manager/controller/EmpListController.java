package com.app.manager.controller;

import com.app.manager.service.EmpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp/list")
public class EmpListController {

    @Autowired
    private EmpListService empListService;

    @GetMapping
    public void getListForm(Model model){
        model.addAttribute("empList", empListService.getList());
    }

}
