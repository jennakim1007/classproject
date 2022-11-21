package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class TodoListController {

//    @Autowired
//    private TodoService todoService;
    private final TodoService todoService;

    public TodoListController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo/list")
    public String getTodoList(Model model){

        model.addAttribute("todoList",todoService.getTodoList());

        return "todo/list";
    }

}
