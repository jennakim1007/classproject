package com.todo.todospring.dao;

import com.todo.todospring.domain.MemberDTO;

import java.sql.Connection;
import java.util.List;

public interface MemberDao {

    List<MemberDTO> selectAll(Connection conn);

    MemberDTO selectbyId(Connection conn, String id);

    int insertMember(Connection conn, MemberDTO dto);

    int deleteMember(Connection conn, MemberDTO dto);

    int updateMember(Connection conn, MemberDTO dto);


}
