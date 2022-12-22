package com.app.todo.service;

import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TodoDeleteService {

    @Autowired
    private TodoRepository todoRepository;

    public int deleteTodo(int tno){

        return todoRepository.deleteByTno(tno);

    }

}
