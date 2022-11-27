package com.todo.todospring.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.todo.todospring.service.TodoReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class TodoReadController {

    @Autowired
    private TodoReadService todoReadService;

    @GetMapping("/todo/read")
    public void readTodo(Model model, @RequestParam("tno") int tno){

        model.addAttribute("todo", todoReadService.getTodoByTno(tno));

        // return "todo/read";

    }


}
