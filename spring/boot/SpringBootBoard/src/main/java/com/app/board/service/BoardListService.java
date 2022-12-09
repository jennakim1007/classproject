package com.app.board.service;

import com.app.board.domain.BoardArticleDTO;
import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardListPage;
import com.app.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListService {

    @Autowired
    private BoardMapper boardMapper;

    public BoardListPage getPage(int pageNum){
        // 게시물의 리스트
        List<BoardArticleDTO> list = boardMapper.selectList((pageNum-1)*10, 10);

        // 전체 게시물의 갯수
        int totalCount = boardMapper.totalCount();

        // 페이지
        BoardListPage boardListPage = new BoardListPage(10, pageNum, list, totalCount);
        return  boardListPage;
    }

    public List<BoardArticleDTO> getList(int pageNum){
        int index = (pageNum-1)*10; // 1page -> 0 ... 2 page -> 10 ... 4 page -> 30 ....
        int count = 10;
        return boardMapper.selectList(index, count);
    }

}
