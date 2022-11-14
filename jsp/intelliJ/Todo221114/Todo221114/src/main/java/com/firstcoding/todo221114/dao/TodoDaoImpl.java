package com.firstcoding.todo221114.dao;

import com.firstcoding.todo221114.domain.TodoDTO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDaoImpl implements TodoDao {
    @Override
    public List<TodoDTO> selectAll(Connection conn) throws SQLException {

        String sql = "Select * from tbl_todo";
        List<TodoDTO> result = new ArrayList<>();

        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            result.add(new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("duedate"), rs.getBoolean("finished")));
        }
        return result;

    }

    @Override
    public TodoDTO selectbyTodoDTO(Connection conn, int tno) throws SQLException {
        return null;
    }

    @Override
    public int insert(Connection conn, TodoDTO todoDTO) throws SQLException {

        int result = 0;

        String sql = "insert into tbl_todo values(?,?,?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, todoDTO.getTno());
        pstmt.setString(2, todoDTO.getTodo());
        pstmt.setString(3, todoDTO.getDueDate());
        pstmt.setBoolean(4, todoDTO.isFinished());

        result = pstmt.executeUpdate();
        return result;

    }

    @Override
    public int update(Connection conn, TodoDTO todoDTO) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Connection conn, TodoDTO todoDTO) throws SQLException {
        return 0;
    }
}
