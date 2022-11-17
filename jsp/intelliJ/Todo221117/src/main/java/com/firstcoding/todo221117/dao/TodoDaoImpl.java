package com.firstcoding.todo221117.dao;

import com.firstcoding.todo221117.domain.TodoDTO;
import com.firstcoding.todo221117.util.ConnectionProvider;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDaoImpl implements TodoDao{
    @Override
    public List<TodoDTO> selectAll(Connection conn) throws SQLException {

        List<TodoDTO> result = new ArrayList<>();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement("select * from tbl_todo");
        @Cleanup ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            result.add(new TodoDTO(rs.getInt("tno"), rs.getString("todo"), rs.getString("dueDate"), rs.getBoolean("finished")));
        }
        return result;
    }

    @Override
    public TodoDTO selectByTno(Connection conn, int tno) throws SQLException {

        TodoDTO todoDTO = null;

        String sql = "select * from tbl_todo where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, tno);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            todoDTO = new TodoDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4));
        }

        return todoDTO;

    }

    @Override
    public int insertTodo(Connection conn, TodoDTO dto) throws SQLException {
        @Cleanup PreparedStatement pstmt = conn.prepareStatement("insert into tbl_todo(todo, dueDate) values (?,?)");
        pstmt.setString(1, dto.getTodo());
        pstmt.setString(2, dto.getDueDate());
        int result = pstmt.executeUpdate();
        return result;
    }

    @Override
    public int updateTodo(Connection conn, TodoDTO dto) throws SQLException {

        int result=0;
        String sql = "update tbl_todo set todo=?, duedate=?, finished=? where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getTodo());
        pstmt.setString(2, dto.getDueDate());
        pstmt.setBoolean(3, dto.isFinished());
        pstmt.setInt(4, dto.getTno());
        result = pstmt.executeUpdate();
        return result;

    }

    @Override
    public int deleteTodo(Connection conn, int dto) throws SQLException {

        int result = 0;
        String sql = "delete from tbl_todo where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, dto);
        result = pstmt.executeUpdate();

        return result;
    }
}
