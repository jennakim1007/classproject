package com.app.board.controller.board;

import com.app.board.domain.BoardWriteRequest;
import com.app.board.service.BoardWriterService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

@Controller
@RequestMapping("/board/write")
@Log4j2
public class BoardWriteController {

    @Autowired
    private BoardWriterService boardWriterService;

    @GetMapping
    public void writeForm(){
    }

    @PostMapping
    public String write(BoardWriteRequest boardWriteRequest){
        log.info("boardWriteRequest >>>" + boardWriteRequest);
        String absolutePath = new File("").getAbsolutePath();
        log.info("absolutePath >>> " + absolutePath);

        boardWriterService.write(boardWriteRequest);
        return "redirect:/board/list";
    }


}
