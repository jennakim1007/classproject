package com.app.todo;

import com.app.todo.entity.Todo;
import com.app.todo.entity.TodoMember;
import com.app.todo.repository.TodoRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@Log4j2
@SpringBootTest
public class TodoTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void modifyTodoTest(){
        todoRepository.updateTodoByTno("수정", LocalDate.parse("2022-12-31"), 1, 128);
    }

    @Test
    public void deleteTodoTest(){
        todoRepository.deleteByTno(120);
    }

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
