package com.todo.todospring.mapper;

import com.todo.todospring.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("select * from member")
    List<MemberDTO> selectAll();

    MemberDTO selectbyIdPw(String uid, String pw);

    int insertMember(MemberDTO memberDTO);

    int deleteMember(MemberDTO memberDTO);

    int updateMember(MemberDTO memberDTO);

}
