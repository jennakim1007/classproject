package com.app.board.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Board;
import com.app.board.entity.Reply;
import com.app.board.mapper.ReplyMapper;
import com.app.board.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReplyInsertService {

    @Autowired
    private ReplyMapper replyMapper;

    @Autowired
    private ReplyRepository replyRepository;

    public Reply insertReply(ReplyDTO replyDTO){
        Reply reply = replyDTO.toReplyEntity();
        reply.setReplydate(LocalDate.now());
        reply.setUpdatedate(LocalDate.now());
        return replyRepository.save(reply);
    }

    /*public int insertReply(ReplyDTO replyDTO){
        return replyMapper.insertReply(replyDTO);
    }*/

}
