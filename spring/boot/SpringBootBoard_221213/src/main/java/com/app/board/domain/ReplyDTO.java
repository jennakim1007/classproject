package com.app.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ReplyDTO {

    private int rno;

    private int bno; // board 외래키

    private String reply;

    private String replyer;

    private String replydate;

    private String updatedate;

}
