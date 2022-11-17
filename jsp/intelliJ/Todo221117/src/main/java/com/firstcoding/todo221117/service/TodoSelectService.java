package com.firstcoding.todo221117.service;

import com.firstcoding.todo221117.dao.TodoDao;
import com.firstcoding.todo221117.dao.TodoDaoImpl;
import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionProvider;
import lombok.Cleanup;

import java.sql.Connection;

public class TodoSelectService {

    private TodoDaoImpl dao;

    static private  TodoSelectService instance = new TodoSelectService(new TodoDaoImpl());

    public TodoSelectService(TodoDaoImpl dao) {
        this.dao = dao;
    }

    public static TodoSelectService getInstance() {
        return instance;
    }

    public TodoDTO selectTodo(int tno){

        TodoDTO todoDTO = null;

        try {
            @Cleanup Connection conn = null;
            conn = ConnectionProvider.getConnection();
            todoDTO = dao.selectByTno(conn, tno);

        } catch (Exception e) {
            // throw new RuntimeException(e);
        }

        return todoDTO;

    }


}
