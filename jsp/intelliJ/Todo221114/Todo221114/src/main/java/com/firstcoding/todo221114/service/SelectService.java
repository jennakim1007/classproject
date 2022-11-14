package com.firstcoding.todo221114.service;

import com.firstcoding.todo221114.dao.TodoDaoImpl;
import com.firstcoding.todo221114.domain.TodoDTO;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import com.firstcoding.todo221114.util.ConnectionUtil;
import java.sql.Connection;
import java.util.List;

@Log4j2
public class SelectService {

    private TodoDaoImpl todoDao = new TodoDaoImpl();

    public List<TodoDTO> selectAll() throws Exception {

        log.info("SelectService selectAll()...");

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

        List<TodoDTO> list = todoDao.selectAll(conn);

        return list;

    }

}
