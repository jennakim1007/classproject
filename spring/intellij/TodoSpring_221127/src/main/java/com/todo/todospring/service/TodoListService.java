package com.todo.todospring.service;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.mapper.TodoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {

    private TodoMapper todoMapper;

    public List<TodoDTO> getTodoList(){
        return todoMapper.selectAll();
    }


}
