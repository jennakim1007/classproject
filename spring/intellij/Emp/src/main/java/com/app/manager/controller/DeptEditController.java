package com.app.manager.controller;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.DeptEditService;
import com.app.manager.service.DeptReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dept/edit")
public class DeptEditController {

    @Autowired
    private DeptEditService deptEditService;

    @Autowired
    private DeptReadService deptReadService;

    @GetMapping
    public String readEditForm(@RequestParam("deptno") int deptno, Model model){
        model.addAttribute("dept", deptReadService.readDeptByDeptno(deptno));
        return "/dept/edit";
    }

    @PostMapping
    public String edit(DeptDTO deptDTO){
        deptEditService.edit(deptDTO);
        return "redirect:/dept/list";
    }


}
