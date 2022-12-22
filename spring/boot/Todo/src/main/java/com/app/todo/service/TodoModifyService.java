package com.app.todo.service;

import com.app.todo.domain.TodoRequest;
import com.app.todo.entity.Todo;
import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TodoModifyService {

    @Autowired
    private TodoRepository todoRepository;

    public int modifyTodo(TodoRequest todoRequest){

        Todo todo = todoRequest.toTodoEntity();
        log.info("todo........" + todo);
        log.info("todo.getTno()........"+todo.getTno());
        log.info("todo.getTodo()........"+todo.getTodo());
        return todoRepository.updateTodoByTno(todo.getTodo(), todo.getDuedate(), todo.getFinished(), todo.getTno());

    }



}
