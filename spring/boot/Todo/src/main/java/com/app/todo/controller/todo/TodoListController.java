package com.app.todo.controller.todo;

import com.app.todo.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping("/todo/list")
    public void getTodoList(Model model, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum){

        model.addAttribute("todoPage", todoListService.getPage(pageNum));

    }



}
