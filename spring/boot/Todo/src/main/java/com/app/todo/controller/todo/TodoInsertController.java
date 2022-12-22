package com.app.todo.controller.todo;

import com.app.todo.domain.TodoRequest;
import com.app.todo.entity.Todo;
import com.app.todo.service.TodoInsertService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/todo/register")
public class TodoInsertController {

    @Autowired
    private TodoInsertService todoInsertService;

    @GetMapping
    public void getRegisterPage(){

    }

    @PostMapping
    public String insertTodo(TodoRequest todoRequest){

        log.info("todo......." + todoRequest);
        todoInsertService.insertTodo(todoRequest);

        return "redirect:/todo/list";

    }



}
