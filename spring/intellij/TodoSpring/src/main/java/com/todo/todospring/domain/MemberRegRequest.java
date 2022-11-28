package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

// 사용자로부터 받는 데이터 DTO
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class MemberRegRequest {

    @NotEmpty(message = "ID는 필수 항목")
    private String uid;
    @NotEmpty
    private String pw;
    @NotEmpty
    private String uname;
    @NotNull
    private MultipartFile uphoto;

    public Member toMember(){

        Member member = Member.builder().uid(this.uid).pw(this.pw).uname(this.uname).build();
        return member;

    }

}
