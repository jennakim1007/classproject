package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@Log4j2
@RequestMapping("/todo/register")
public class TodoInsertController {

    private final TodoService todoService;

    public TodoInsertController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String getInsertForm(){
        return "todo/register";
    }

    @PostMapping
    public String insert(@RequestParam("todo")String todo, @RequestParam("dueDate") String dueDate){

        // test : 사용자가 입력한 데이터를 받아와야 한다.
        log.info("todo =>" + todo);
        log.info("dueDate =>" + dueDate);

        TodoDTO todoDTO = TodoDTO.builder().todo(todo).dueDate(LocalDate.parse(dueDate)).build();
        log.info("todoDTO =>" + todoDTO);

        todoService.insertTodo(todoDTO);

        return "redirect:/todo/list";
    }




}
