package com.todo.todospring.mapper;

import com.todo.todospring.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberDTO selectbyIdPw(String uid, String pw);

    int insertMember(MemberDTO memberDTO);


}
