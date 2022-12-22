package com.app.todo.security;

import com.app.todo.domain.MemberRequest;
import com.app.todo.entity.TodoMember;
import com.app.todo.repository.TodoMemberRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private TodoMemberRepository todoMemberRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 1. username 을 통해 todomember 받기 
        log.info("UserDetailService 이름 받기......." + username);
        Optional<TodoMember> result = todoMemberRepository.findByUserid(username);

        // 2. TodoMember.isEmpty() 여부 확인
        if(result.isEmpty()){
            throw new UsernameNotFoundException("회원의 아이디 또는 비밀번호를 확인하세요.");
        }

        TodoMember todoMember = result.get();

        // 3. 권한 데이터 처리
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+todoMember.getRole()));

        // 4. 회원의 정보, 권한 정보 -> customUser 인스턴스 생성 반환
        CustomUser customUser = new CustomUser(todoMember.getUserid(), todoMember.getPassword(), authorities, todoMember);
        log.info("customUser......." + customUser);

        return customUser;

    }

    public int save(MemberRequest memberRequest){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        memberRequest.setPassword(encoder.encode(memberRequest.getPassword()));

        TodoMember member = memberRequest.toMemberEntity();

        return todoMemberRepository.save(member) != null ? 1 : 0;
    }






}
