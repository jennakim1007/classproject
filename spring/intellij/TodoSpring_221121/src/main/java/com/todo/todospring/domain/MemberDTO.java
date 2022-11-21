package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class MemberDTO {

        private String id;
        private String pw;
        private String name;
        private MultipartFile profilePic;

}
