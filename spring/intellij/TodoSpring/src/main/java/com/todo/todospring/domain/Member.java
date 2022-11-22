package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

// DB와 연결하는 DTO
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Member {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;
    private String uname;
     private String uphoto; // DB 와 연결하는 DTO 이므로 String 으로 선언함
    // private MultipartFile uphoto;

    public LoginInfo toLoginInfo(){
        return LoginInfo.builder()
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();

    }




}
