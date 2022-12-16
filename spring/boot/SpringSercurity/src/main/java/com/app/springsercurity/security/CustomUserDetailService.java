package com.app.springsercurity.security;

import com.app.springsercurity.entity.Member;
import com.app.springsercurity.entity.MemberRole;
import com.app.springsercurity.repository.MemberRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info(" >>>>>>> loadUserByUsername......" + username);

        Optional<Member> result = memberRepository.findById(username);

        if(result.isEmpty()){
            throw new UsernameNotFoundException("check UserEmail or Password..."); // check email...
        }

        Member member = result.get();
        log.info(">>>>>>>>>>>> member........." + member);

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for(MemberRole memberRole : member.getRoleSet()){
            // ROLE_ADMIN || ROLE_USER
            authorities.add(new SimpleGrantedAuthority("ROLE_" + memberRole.name()));
        }

        AuthMemberDTO authMemberDTO = new AuthMemberDTO(member.getEmail(), member.getPassword(), authorities, member.getName());

        return authMemberDTO;

    }

}
