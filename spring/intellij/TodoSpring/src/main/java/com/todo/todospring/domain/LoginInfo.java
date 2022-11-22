package com.todo.todospring.domain;

import lombok.*;

// 로그인시에 가지고 있을 값 DTO
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class LoginInfo {

    private String uid;
    private String uname;
    private String uphoto;

}
