package com.todo.todospring.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.todo.todospring.service.TodoService;
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
    private TodoService todoService;

    @GetMapping("/todo/read")
    public void readTodo(Model model, @RequestParam("tno") int tno){

        model.addAttribute("todo", todoService.getTodo(tno));

        // return "todo/read";

    }


}
