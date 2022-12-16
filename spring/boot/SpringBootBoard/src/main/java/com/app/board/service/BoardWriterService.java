package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardWriteRequest;
import com.app.board.entity.Board;
import com.app.board.mapper.BoardMapper;
import com.app.board.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.aspectj.apache.bcel.classfile.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

@Service
@Log4j2
public class BoardWriterService {

    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private BoardRepository boardRepository;

    public int write(BoardWriteRequest boardWriteRequest){

        MultipartFile file = boardWriteRequest.getFormFile();
        File saveDir = null;
        String newFileName = null;

        // 파일 업로드를 한다면...
        if(file!=null && !file.isEmpty() && file.getSize()>0){
            // absolutePath 경로 확인
            String absolutePath = new File("").getAbsolutePath();
            log.info("absolutePath >>> " + absolutePath);

            // 새로 만든 경로(기본경로에 photo를 포함하고 있는 디렉토리)
            String path = "photo";
            saveDir = new File(absolutePath, path);

            // 폴더 존재 부 -> 폴더 생성
            if(!saveDir.exists()){
                saveDir.mkdirs(); // 폴더 생성하는 메소드
                log.info("photo 디렉토리 생성");
            }

            // 폴더 존재 여 -> 파일 저장
            String uuid = UUID.randomUUID().toString();
            newFileName = uuid + file.getOriginalFilename(); // 난수 + 원래 파일 이름으로 저장
            File newFile = new File(saveDir, newFileName); // 새로운 저장 파일의 경로
            try {
                file.transferTo(newFile); // 파일 저장
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // DB에 저장 -> 파일이 있다면...
        // request -> entity
        Board board = boardWriteRequest.toBoardEntity();
        // BoardDTO boardDTO = boardWriteRequest.toBoardDTO();
        if(newFileName!=null){
            board.setPhoto(newFileName);
        }

        int result = 0;

        try{
            // DB insert
            // result = boardMapper.insert(boardDTO);
            result = boardRepository.save(board) !=null ? 1 : 0;
        } catch (Exception e){
            // DB insert 실패시 저장된 파일도 삭제
            if(newFileName!=null){
                File delFile = new File(saveDir, newFileName);
                if(delFile.exists()){
                    delFile.delete(); // 파일 삭제
                }
            }
        }

        return result;
    }

    /*public int write(BoardWriteRequest boardWriteRequest){

        MultipartFile file = boardWriteRequest.getFormFile();
        File saveDir = null;
        String newFileName = null;

        // 파일 업로드를 한다면...
        if(file!=null && !file.isEmpty() && file.getSize()>0){
            // absolutePath 경로 확인
            String absolutePath = new File("").getAbsolutePath();
            log.info("absolutePath >>> " + absolutePath);

            // 새로 만든 경로(기본경로에 photo를 포함하고 있는 디렉토리)
            String path = "photo";
            saveDir = new File(absolutePath, path);

            // 폴더 존재 부 -> 폴더 생성
            if(!saveDir.exists()){
                saveDir.mkdirs(); // 폴더 생성하는 메소드
                log.info("photo 디렉토리 생성");
            }

            // 폴더 존재 여 -> 파일 저장
            String uuid = UUID.randomUUID().toString();
            newFileName = uuid + file.getOriginalFilename(); // 난수 + 원래 파일 이름으로 저장
            File newFile = new File(saveDir, newFileName); // 새로운 저장 파일의 경로
            try {
                file.transferTo(newFile); // 파일 저장
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // DB에 저장 -> 파일이 있다면...
        BoardDTO boardDTO = boardWriteRequest.toBoardDTO();
        if(newFileName!=null){
            boardDTO.setPhoto(newFileName);
        }

        int result = 0;

        try{
            // DB insert
            result = boardMapper.insert(boardDTO);
        } catch (SQLException e){
            // DB insert 실패시 저장된 파일도 삭제
            if(newFileName!=null){
                File delFile = new File(saveDir, newFileName);
                if(delFile.exists()){
                    delFile.delete(); // 파일 삭제
                }
            }
        }

        return result;
    }*/


}
