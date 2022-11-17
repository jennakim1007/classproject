package com.firstcoding.todo221117.dao;

import com.firstcoding.todo221117.domain.TodoDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TodoDao {

    List<TodoDTO> selectAll(Connection conn) throws SQLException;

    TodoDTO selectByTno(Connection conn, int tno) throws SQLException;

    int insertTodo(Connection conn, TodoDTO dto) throws SQLException;

    int updateTodo(Connection conn, TodoDTO dto) throws SQLException;

    int deleteTodo(Connection conn, int dto) throws SQLException;

}
