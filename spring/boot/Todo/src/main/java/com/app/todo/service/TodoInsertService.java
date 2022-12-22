package com.app.todo.service;

import com.app.todo.entity.Todo;
import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TodoInsertService {

    @Autowired
    private TodoRepository todoRepository;

    public int insertTodo(Todo todo){

        int result = todoRepository.save(todo) != null ? 1 : 0;
        return result;

    }


}
