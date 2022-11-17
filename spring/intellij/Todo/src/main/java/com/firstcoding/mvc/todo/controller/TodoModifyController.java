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
public class TodoModifyController {

    // Todo 수정하기
    @GetMapping("/modify")
    public String getModifyTodo(){
        return "todo/modify";
    }

    @PostMapping("/modify")
    public String modify(){
        return "todo/list";
    }



}
