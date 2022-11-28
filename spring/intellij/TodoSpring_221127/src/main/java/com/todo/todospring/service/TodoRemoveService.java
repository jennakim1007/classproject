package com.todo.todospring.service;

import com.todo.todospring.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoRemoveService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    public int deleteBytno(long tno) {
        return todoMapper.deleteTodo(tno);
    }

}
