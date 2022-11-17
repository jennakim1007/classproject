package com.firstcoding.mvc.todo.controller;

import com.firstcoding.mvc.todo.domain.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/todo") // 기본 경로 매핑
public class TodoRegisterController {

    // Todo 등록
    @GetMapping("/register")
    public String getRegisterTodo(){
        return "todo/register";
    }

    @PostMapping("/register")
    public String register(
            @ModelAttribute("req")TodoDTO todoDTO
            ){
        log.info("todoDTO" + todoDTO);
        return "todo/list";
    }

}
