package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class MemberDTO {

        private int idx;
        private String uid;
        private String pw;
        private String uuid;
        private String uname;
        private MultipartFile uphoto;
        private String uphotoName;

        public MemberDTO(int idx, String uid, String pw, String uname, String uphotoName) {
                this.idx = idx;
                this.uid = uid;
                this.pw = pw;
                this.uname = uname;
                this.uphotoName = uphotoName;
        }

        public MemberDTO toMember(){
                MemberDTO member = MemberDTO.builder()
                        .uid(this.uid)
                        .pw(this.pw)
                        .uname(this.uname)
                        .uphoto(this.uphoto)
                        .build();
                return member;
        }

        public MemberDTO toLoginInfo(){
                MemberDTO member = MemberDTO.builder()
                        .uid(this.uid)
                        .uname(this.uname)
                        .uphotoName(this.uphotoName)
                        .build();
                return member;
        }


}

