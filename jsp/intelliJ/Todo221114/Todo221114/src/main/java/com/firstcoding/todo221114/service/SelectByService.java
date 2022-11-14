package com.firstcoding.todo221114.service;

import com.firstcoding.todo221114.dao.TodoDaoImpl;
import com.firstcoding.todo221114.domain.TodoDTO;
import com.firstcoding.todo221114.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class SelectByService {

    TodoDaoImpl todoDao = new TodoDaoImpl();

    public TodoDTO selectByTno(int tno) throws Exception {

        log.info("SelectByService ... selectByTno()");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        TodoDTO todoDTO = todoDao.selectbyTodoDTO(conn, tno);

        return todoDTO;

    }



}
