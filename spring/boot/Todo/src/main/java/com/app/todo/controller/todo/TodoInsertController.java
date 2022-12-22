package com.app.todo.controller.todo;

import com.app.todo.entity.Todo;
import com.app.todo.service.TodoInsertService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
public class TodoInsertController {

    @Autowired
    private TodoInsertService todoInsertService;

    @GetMapping("/todo/register")
    public void getRegisterPage(){

    }

    @PostMapping
    public String insertTodo(Todo todo){

        log.info("todo......." + todo);
        todoInsertService.insertTodo(todo);

        return "redirect:/todo/list";

    }



}
