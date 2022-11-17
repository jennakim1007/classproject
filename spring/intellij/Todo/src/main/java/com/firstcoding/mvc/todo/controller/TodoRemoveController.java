package com.firstcoding.mvc.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/todo")
public class TodoRemoveController {

    // Todo 삭제하기
    @PostMapping("/remove")
    public String removeTodo(){
        return "todo/list";
    }

}
