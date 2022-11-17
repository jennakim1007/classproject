package com.firstcoding.todo221117.service;

import com.firstcoding.todo221117.dao.TodoDaoImpl;
import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class TodoInsertService {

    private TodoDaoImpl dao;

    static private TodoInsertService instance = new TodoInsertService(new TodoDaoImpl());


    public TodoInsertService(TodoDaoImpl dao) {
        this.dao = dao;
    }

    public static TodoInsertService getInstance() {
        return instance;
    }

    public int insertTodo(TodoDTO dto) throws Exception {

        log.info("TodoRegisterService insertTodo()...");

        int result = 0;

        @Cleanup Connection conn = ConnectionProvider.getConnection();
        result = dao.insertTodo(conn, dto);

        return result;

    }




}
