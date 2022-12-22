package com.app.todo.controller.todo;

import com.app.todo.service.TodoListService;
import com.app.todo.service.TodoReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @Autowired
    private TodoReadService todoReadService;

    @GetMapping
    public void modifyTodo(Model model, @RequestParam("tno") int tno){

        model.addAttribute("todo", todoReadService.selectTodo(tno));

    }

}
