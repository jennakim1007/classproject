package com.todo.todospring.dao;

import com.todo.todospring.domain.MemberDTO;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface MemberDao {

    List<MemberDTO> selectAll(Connection conn);

    MemberDTO selectbyIdPw(Connection conn, String uid, String pw) throws SQLException;

    int insertMember(Connection conn, MemberDTO dto) throws SQLException;

    int deleteMember(Connection conn, MemberDTO dto);

    int updateMember(Connection conn, MemberDTO dto);


}
