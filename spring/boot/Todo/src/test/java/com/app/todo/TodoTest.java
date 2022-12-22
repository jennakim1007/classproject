package com.app.todo;

import com.app.todo.entity.Todo;
import com.app.todo.entity.TodoMember;
import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@SpringBootTest
public class TodoTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void insertTodoTest(){
        Todo todo = Todo.builder().todo("test").build();
        todoRepository.save(todo);
        log.info("insert todo......." + todo);
    }

    @Test
    public void getTodoListTest(){
        log.info(todoRepository.findAll());
    }


}
