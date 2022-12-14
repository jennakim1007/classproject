package com.app.board;

import com.app.board.entity.BoardMember;
import com.app.board.repository.BoardMemberRepository;
import com.app.board.repository.BoardRepository;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@Log4j2
@SpringBootTest
public class BoardMemberRepositoryTest {

    @Autowired
    private BoardMemberRepository boardMemberRepository;

    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void saveTest(){

        // BoardMember boardMember = BoardMember.builder().userid("cool").username("테스터").password(encoder.encode("1111")).role("USER").regdate(LocalDateTime.now()).editdate(LocalDateTime.now()).build();
        BoardMember boardMember = BoardMember.builder().userid("hot").username("hot").password(encoder.encode("1111")).role("USER").regdate(LocalDateTime.now()).editdate(LocalDateTime.now()).build();
        BoardMember member = boardMemberRepository.save(boardMember);

        log.info(member);

    }


}
