package com.todo.todospring.service;

import com.todo.todospring.dao.MemberDao;
import com.todo.todospring.domain.Member;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;

@Log4j2
@Service
public class LoginService {

    @Autowired
    private MemberMapper memberMapper;

    public Member login(String uid, String pw) throws Exception {

        return memberMapper.selectByIdPw(uid, pw);

    }

}
