package com.firstcoding.todo221117.service;

import com.firstcoding.todo221117.dao.TodoDaoImpl;
import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class TodoDeleteService {

    private TodoDaoImpl dao;

    static private TodoDeleteService instance = new TodoDeleteService(new TodoDaoImpl());

    public TodoDeleteService(TodoDaoImpl dao) {
        this.dao=dao;
    }

    public static TodoDeleteService getInstance(){
        return instance;
    }

    public int deleteTodo(int tno){

        log.info("TodoDeleteService deleteTodo()...");

        int result = 0;
        try {
            @Cleanup Connection conn = null;
            conn = ConnectionProvider.getConnection();
            result = dao.deleteTodo(conn, tno);
        } catch (Exception e) {
            // throw new RuntimeException(e);
        }
        return result;
    }
}
