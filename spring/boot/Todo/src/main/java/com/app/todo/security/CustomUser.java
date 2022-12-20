package com.app.todo.security;

import com.app.todo.entity.TodoMember;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
public class CustomUser extends User {

    private TodoMember todoMember; // 추가 회원 정보 넣기


    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities, TodoMember todoMember) {
        super(username, password, authorities);
        this.todoMember=todoMember;
    }

    public CustomUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, TodoMember todoMember) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.todoMember=todoMember;
    }


}
