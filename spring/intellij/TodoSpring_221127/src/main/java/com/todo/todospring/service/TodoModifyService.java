package com.todo.todospring.service;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoModifyService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public int modify(TodoDTO todoDTO){
        return todoMapper.updateTodo(todoDTO);
    }

}
