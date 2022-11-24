package com.app.manager.controller;

import com.app.manager.domain.EmpDTO;
import com.app.manager.service.EmpEditService;
import com.app.manager.service.EmpReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/emp/edit")
public class EmpEditController {

    @Autowired
    private EmpReadService empReadService;

    @Autowired
    private EmpEditService empEditService;

    @GetMapping
    public String readEditPage(Model model, @RequestParam("empno") int empno){
        empReadService.readEmp(empno);
        model.addAttribute("emp", empReadService.readEmp(empno));
        return "/emp/edit";
    }

    @PostMapping
    public String Edit(EmpDTO empDTO){
        empEditService.edit(empDTO);
        return "redirect:/emp/list";
    }

}
