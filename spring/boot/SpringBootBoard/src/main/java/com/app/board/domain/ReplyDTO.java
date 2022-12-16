package com.app.board.domain;

import com.app.board.entity.Reply;
import lombok.*;

import java.time.LocalDate;

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

    public Reply toReplyEntity(){
        return Reply.builder().rno(rno).bno(bno).reply(reply).replyer(replyer)
                /*.replydate(LocalDate.parse(replydate))*/
                .build();
    }


}
