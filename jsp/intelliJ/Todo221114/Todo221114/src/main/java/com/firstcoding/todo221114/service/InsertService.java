package com.firstcoding.todo221114.service;

import com.firstcoding.todo221114.dao.TodoDaoImpl;
import com.firstcoding.todo221114.domain.TodoDTO;
import com.firstcoding.todo221114.util.ConnectionProvider;
import com.firstcoding.todo221114.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class InsertService {


    public int insert(TodoDTO todoDTO) throws Exception {

        log.info("InsertService ... insert()");

        int result = 0;

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        result = new TodoDaoImpl().insert(conn, todoDTO);

        return result;

    }

}
