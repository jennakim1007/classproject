package com.firstcoding.todo221117.service;

import com.firstcoding.todo221117.dao.TodoDaoImpl;
import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;

@Log4j2
public class TodoListService{

    private TodoDaoImpl dao;
    static private TodoListService instance = new TodoListService(new TodoDaoImpl());

    public TodoListService(TodoDaoImpl dao) {
        this.dao=dao;
    }

    public static TodoListService getInstance(){
        return instance;
    }

    public List<TodoDTO> getTodoList() throws Exception {

        log.info("TodoListService getTodoList()...");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<TodoDTO> list = dao.selectAll(conn);

        return list;

    }

}
