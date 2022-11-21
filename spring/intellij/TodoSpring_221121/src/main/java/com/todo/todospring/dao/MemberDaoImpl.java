package com.todo.todospring.dao;

import com.todo.todospring.domain.MemberDTO;

import java.sql.Connection;
import java.util.List;

public class MemberDaoImpl implements MemberDao{
    @Override
    public List<MemberDTO> selectAll(Connection conn) {
        return null;
    }

    @Override
    public MemberDTO selectbyId(Connection conn, String id) {
        return null;
    }

    @Override
    public int insertMember(Connection conn, MemberDTO dto) {
        return 0;
    }

    @Override
    public int deleteMember(Connection conn, MemberDTO dto) {
        return 0;
    }

    @Override
    public int updateMember(Connection conn, MemberDTO dto) {
        return 0;
    }
}
