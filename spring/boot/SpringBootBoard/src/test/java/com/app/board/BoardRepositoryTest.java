package com.app.board;

import com.app.board.entity.BoardDTO;
import com.app.board.entity.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Log4j2
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    // 모든 리스트 가져오기
    @Test
    public void getAllListTest(){
        List<BoardDTO> list = boardRepository.findAll();
        for(BoardDTO boardDTO : list){
            log.info(boardDTO);
        }
    }

    // 리스트 정렬 기준 설정 : bno desc -> 최신 게시글 순으로 정렬
    @Test
    public void getSortedListTest(){
        List<BoardDTO> list = boardRepository.findAll(Sort.by(Sort.Direction.DESC, "bno"));
        for(BoardDTO boardDTO : list){
            log.info(boardDTO);
        }
    }

    // 검색 : bno를 사용하여 특정 게시글을 찾기
    @Test
    public void findByBnoTest(){
        Optional<BoardDTO> boardDTO = boardRepository.findById(203);
        BoardDTO boardData = boardDTO.orElse(null);
        log.info(boardData);
    }

    // 검색(in 연산) : bno들을 사용하여 여러 게시글을 찾기
    @Test
    public void findByBnosTest(){
        List<Integer> bnos = Arrays.asList(203, 202, 201);
        List<BoardDTO> list = boardRepository.findAllById(bnos);
        for(BoardDTO boardDTO : list){
            log.info(boardDTO);
        }
    }

    // insert
    @Test
    public void insertBoardTest(){
        BoardDTO insertData = BoardDTO.builder().title("jpa제목").writer("JPA").content("JPA테스트입니다.").build();
        log.info("insertData 전..." + insertData);
        BoardDTO resultData = boardRepository.save(insertData);
        log.info("insertData 후..." + insertData);
    }

    // update
    @Test
    public void updateBoardTest(){
        BoardDTO editData = BoardDTO.builder().bno(225).title("jpa수정").writer("JPA").content("JPA테스트입니다.").regdate(LocalDate.now()).build();
        log.info("update 전..." + editData);
        BoardDTO resultData = boardRepository.save(editData);
        log.info("update 후..." + resultData);
    }

    // delete
    @Test
    public void deleteBoardTest(){
        boardRepository.deleteByBno(225);
    }

    // count - 전체 게시물 수
    @Test
    public void countBoard(){
        long cnt = boardRepository.count();
        log.info("전체 게시물 수..."+cnt);
    }

    // count - 사진이 있는 게시물 수
    @Test
    public void countBoardHasPhotoTest(){
        long cnt = boardRepository.countByPhotoNotNull();
        log.info("사진이 있는 게시물 수..."+cnt);
    }

    // find like - 제목으로 검색
    @Test
    public void searchByTitleTest(){
        List<BoardDTO> list = boardRepository.findByTitleLike("%사%");
        for(BoardDTO boardDTO : list){
            log.info(boardDTO);
        }
    }

    // find between - 기간으로 검색
    @Test
    public void searchByRegdate(){
        List<BoardDTO> list = boardRepository.findByRegdateBetween(2022-12-8,2022-12-9);
        for(BoardDTO boardDTO : list){
            log.info(boardDTO);
        }
    }




}
