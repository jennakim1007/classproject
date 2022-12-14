package com.todo.todospring.controller;

import com.todo.todospring.service.TodoRemoveService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class TodoRemoveController {

    @Autowired
    private TodoRemoveService todoRemoveService;

    @PostMapping("/todo/remove")
    public String removeTodo(@RequestParam("tno") int tno){

        todoRemoveService.deleteBytno(tno);

        return "redirect:/todo/list";
    }

}
