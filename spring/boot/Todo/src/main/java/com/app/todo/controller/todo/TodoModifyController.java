package com.app.todo.controller.todo;

import com.app.todo.domain.TodoRequest;
import com.app.todo.service.TodoListService;
import com.app.todo.service.TodoModifyService;
import com.app.todo.service.TodoReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j2
@Controller
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @Autowired
    private TodoReadService todoReadService;

    @Autowired
    private TodoModifyService todoModifyService;

    @GetMapping
    public void readTodo(Model model, @RequestParam("tno") int tno){
        model.addAttribute("todo", todoReadService.selectTodo(tno));
    }

    @PostMapping
    public String modifyTodo(TodoRequest todoRequest, RedirectAttributes redirectAttributes){
        log.info("todoRequest........" + todoRequest);
        redirectAttributes.addAttribute("tno", todoRequest.getTno());
        todoModifyService.modifyTodo(todoRequest);
        return "redirect:/todo/list";
    }

}
