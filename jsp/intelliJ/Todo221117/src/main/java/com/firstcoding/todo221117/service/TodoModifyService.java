package com.firstcoding.todo221117.service;

import com.firstcoding.todo221117.dao.TodoDaoImpl;
import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionProvider;
import lombok.Cleanup;

import java.sql.Connection;

public class TodoModifyService {

    private TodoDaoImpl dao;

    static private TodoModifyService instance = new TodoModifyService(new TodoDaoImpl());

    public static TodoModifyService getInstance(){
        return instance;
    }

    public TodoModifyService(TodoDaoImpl dao) {
        this.dao = dao;
    }

    public int modifyTodo(TodoDTO todoDTO){

        int result = 0;

        try {
            @Cleanup Connection conn = null;
            conn = ConnectionProvider.getConnection();
            result = dao.updateTodo(conn, todoDTO);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;

    }



}
