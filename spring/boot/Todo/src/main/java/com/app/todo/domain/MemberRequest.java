package com.app.todo.domain;

import com.app.todo.entity.TodoMember;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRequest {

    private String userid;

    private String password;

    private String username;

    public TodoMember toMemberEntity(){
        return TodoMember.builder().userid(userid).password(password).username(username).build();
    }


}
