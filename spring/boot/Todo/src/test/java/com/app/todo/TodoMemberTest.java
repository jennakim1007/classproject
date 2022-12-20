package com.app.todo;

import com.app.todo.entity.TodoMember;
import com.app.todo.repository.TodoMemberRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@Log4j2
@SpringBootTest
public class TodoMemberTest {

    @Autowired
    private TodoMemberRepository todoMemberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertMemberTest(){
        TodoMember todoMember = TodoMember.builder().userid("hot").password(passwordEncoder.encode("1111")).username("HOT").build();
        todoMemberRepository.save(todoMember);
        log.info("insert test......." + todoMember);
    }

    @Test
    public void deleteMemberTest(){
        todoMemberRepository.deleteByUserid("hot");
    }


}
