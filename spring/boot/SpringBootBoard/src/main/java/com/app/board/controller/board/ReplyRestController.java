package com.app.board.controller.board;

import com.app.board.domain.ReplyDTO;
import com.app.board.entity.Board;
import com.app.board.entity.Reply;
import com.app.board.service.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/reply")
public class ReplyRestController {

    @Autowired
    private ReplyListService replyListService;

    @Autowired
    private ReplyInsertService replyInsertService;

    @Autowired
    private ReplyReadService replyReadService;

    @Autowired
    private ReplyDeleteService replyDeleteService;

    @Autowired
    private ReplyEditService replyEditService;

    /* reply controller 역할
    1. get     : reply/{bno} => list 응답
    2. post    : reply => reply 객체 전송
    3. put     : reply/{rno} => reply
    4. delete  : reply/{rno} => 0/1...
    */

    // 1. get : reply/{bno} => list 응답
    @GetMapping(value ="/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Reply>> selectList(@PathVariable("bno") int bno){

        // List<ReplyDTO> list = replyListService.selectAll(bno);
        List<Reply> list = replyListService.selectAll(bno);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // 2. post : reply => reply 객체 전송 : JSON 데이터를 받아서 DB insert
    @PostMapping
    public ResponseEntity<Reply> insertReply(@RequestBody ReplyDTO replyDTO){

        log.info("insert 전 : ..." + replyDTO); // rno 값이 없는 데이터

        // Service -> Mapper
        Reply resultReply = replyInsertService.insertReply(replyDTO);
        // replyDTO.setReplydate(LocalDate.now().toString());
        // 입력된 row의 rno 값을 구할 수 있다.
        Reply reply = replyReadService.selectByRno(resultReply.getRno());

        log.info("insert 후 : ..." + replyDTO); // rno 값이 갱신된 데이터(db에서 자동증가값을 set)

        // return new ResponseEntity<>(replyReadService.selectByRno(replyDTO.getRno()), HttpStatus.OK);
        return new ResponseEntity<>(reply, HttpStatus.OK);

    }

    // 4. delete  : reply/{rno} => 0/1...success/fail...
    @DeleteMapping("/{rno}")
    public ResponseEntity<Integer> delete(@PathVariable("rno") int rno){

        return new ResponseEntity<>(replyDeleteService.deleteByRno(rno), HttpStatus.OK);

    }

    // 3. put : reply/{rno} => reply
    @PutMapping("/{rno}")
    public ResponseEntity<Integer> editReply(@RequestBody ReplyDTO replyDTO, @PathVariable("rno")int rno){

        replyDTO.setRno(rno);
        return new ResponseEntity<>(replyEditService.updateReply(replyDTO), HttpStatus.OK);

    }

}
