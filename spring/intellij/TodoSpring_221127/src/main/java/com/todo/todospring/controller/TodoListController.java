package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @RequestMapping("/todo/list")
    public String getTodoList(Model model){

        model.addAttribute("todoList",todoListService.getTodoList());

        return "todo/list";
    }

}
