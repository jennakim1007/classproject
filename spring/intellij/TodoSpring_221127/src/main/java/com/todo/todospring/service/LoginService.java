package com.todo.todospring.service;

import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private MemberMapper memberMapper;

    public MemberDTO login(String uid, String pw){
        return memberMapper.selectbyIdPw(uid, pw);
    }


}
