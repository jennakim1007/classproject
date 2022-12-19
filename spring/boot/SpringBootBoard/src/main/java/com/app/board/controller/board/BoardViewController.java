package com.app.board.controller.board;

import com.app.board.security.CustomUser;
import com.app.board.service.BoardViewService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class BoardViewController {

    @Autowired
    private BoardViewService boardViewService;

    @GetMapping("/board/view")
    public void readArticle(@RequestParam("bno") int bno, @RequestParam("p") int p, Model model, @AuthenticationPrincipal CustomUser customUser){
        model.addAttribute("currentPageNum", p);
        model.addAttribute("boardView", boardViewService.selectBoard(bno));
        model.addAttribute("midx", customUser.getBoardMember().getIdx());
    }


}
