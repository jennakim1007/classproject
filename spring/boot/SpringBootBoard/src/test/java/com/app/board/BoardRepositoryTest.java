package com.app.board;

import com.app.board.domain.BoardEditRequest;
import com.app.board.domain.BoardWriteRequest;
import com.app.board.entity.Board;
import com.app.board.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.Optional;

@Log4j2
@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void saveTest(){

        // BoardWriteRequest -> Entity -> save()
        BoardWriteRequest writeRequest = BoardWriteRequest.builder().title("1216 jpa test").writer("jpa").content("테스트입니다.").build();

        Board board = writeRequest.toBoardEntity();

        log.info("insert 전... "+board);
        log.info("insert 후... "+boardRepository.save(board));

    }

    @Test
    public void findIdTest(){

        // view 페이지, edit form
        Optional<Board> result = boardRepository.findById(228);
        Board board = result.get();
        log.info("228번 게시물... "+board);

    }

    @Test
    public void editTest(){

        BoardEditRequest editRequest = BoardEditRequest.builder().bno(228).title("1216수정").content("내용을 수정했").build();

        // request => entity
        Board board = editRequest.toBoardEntity();
        board.setUpdatedate(LocalDate.now());

        log.info("수정 전 데이터..." + board);
        Board editBoard = boardRepository.save(board);
        log.info("수정 후 데이터..." + board);

    }

    @Test
    public void deleteTest(){
        int result = boardRepository.deleteByBno(129);
        log.info("삭제 결과... " + result);
    }

    @Test
    public void listTest(){
        // 페이징 -> 구간 select, 한 페이지에 10개씩 게시물이 출력
        Page<Board> page = boardRepository.findAll(PageRequest.of(0, 10, Sort.by("bno").descending()));

        // 전체 게시물 개수
        long totalCnt = page.getTotalElements();
        log.info("전체 게시물 개수..."+totalCnt);

        // 게시물 리스트
        for(Board board : page.getContent()){
            log.info(board);
        }

    }



/*    // 모든 리스트 가져오기
    @Test
    public void getAllListTest(){
        List<Board> list = boardRepository.findAll();
        for(Board board : list){
            log.info(board);
        }
    }

    // 리스트 정렬 기준 설정 : bno desc -> 최신 게시글 순으로 정렬
    @Test
    public void getSortedListTest(){
        List<Board> list = boardRepository.findAll(Sort.by(Sort.Direction.DESC, "bno"));
        for(Board board : list){
            log.info(board);
        }
    }

    // 검색 : bno를 사용하여 특정 게시글을 찾기
    @Test
    public void findByBnoTest(){
        Optional<Board> boardDTO = boardRepository.findById(203);
        Board boardData = boardDTO.orElse(null);
        log.info(boardData);
    }

    // 검색(in 연산) : bno들을 사용하여 여러 게시글을 찾기
    @Test
    public void findByBnosTest(){
        List<Integer> bnos = Arrays.asList(203, 202, 201);
        List<Board> list = boardRepository.findAllById(bnos);
        for(Board board : list){
            log.info(board);
        }
    }

    // insert
    @Test
    public void insertBoardTest(){
        Board insertData = Board.builder().title("jpa제목").writer("JPA").content("JPA테스트입니다.").build();
        log.info("insertData 전..." + insertData);
        Board resultData = boardRepository.save(insertData);
        log.info("insertData 후..." + insertData);
    }

    // update
    @Test
    public void updateBoardTest(){
        Board editData = Board.builder().bno(225).title("jpa수정").writer("JPA").content("JPA테스트입니다.").regdate(LocalDate.now()).build();
        log.info("update 전..." + editData);
        Board resultData = boardRepository.save(editData);
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
        List<Board> list = boardRepository.findByTitleLike("%사%");
        for(Board board : list){
            log.info(board);
        }
    }*/






}
