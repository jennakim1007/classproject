package com.app.todo.controller.todo;

import com.app.todo.service.TodoDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class TodoDeleteController {

    @Autowired
    private TodoDeleteService todoDeleteService;

    @GetMapping("/todo/delete")
    public String delete(@RequestParam("tno")int tno){
        todoDeleteService.deleteTodo(tno);
        return "redirect:/todo/list";
    }


}
