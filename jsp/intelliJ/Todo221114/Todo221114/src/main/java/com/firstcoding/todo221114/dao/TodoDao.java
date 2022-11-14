package com.firstcoding.todo221114.dao;

import com.firstcoding.todo221114.domain.TodoDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TodoDao {

    List<TodoDTO> selectAll(Connection conn) throws SQLException;
    TodoDTO selectbyTodoDTO(Connection conn, int tno) throws SQLException;

    int insert(Connection conn, TodoDTO todoDTO) throws SQLException;
    int update(Connection conn, TodoDTO todoDTO) throws SQLException;
    int delete(Connection conn, TodoDTO todoDTO) throws SQLException;



}
