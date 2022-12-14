package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardEditRequest;
import com.app.board.entity.Board;
import com.app.board.mapper.BoardMapper;
import com.app.board.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.UUID;

@Log4j2
@Service
public class BoardEditService {
    
    @Autowired
    private BoardMapper boardMapper;

    @Autowired
    private BoardRepository boardRepository;
    
    public int edit(BoardEditRequest boardEditRequest){

        MultipartFile file = boardEditRequest.getFormFile();
        File saveDir = null;
        String newFileName = null;

        if(file!=null && !file.isEmpty()){
            // 새로운 파일을 저장
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

        // Request -> Entity
        /*BoardDTO boardDTO = boardEditRequest.toBoardDTO();*/
        Board board = boardEditRequest.toBoardEntity();
        if(newFileName!=null){
            board.setPhoto(newFileName);
        } else{
            board.setPhoto(null);
            // board.setPhoto(boardEditRequest.getOldFile());
        }

        int result = 0;

        try {
            // db update
            /*result = boardMapper.update(boardDTO);*/
            
            // 수정 시간 설정
            board.setUpdatedate(LocalDate.now());

            boardRepository.save(board);

            // 새로운 파일이 저장되고, 이전 파일이 존재한다면 이전 파일을 삭제
            String oldFileName = boardEditRequest.getOldFile();
            if(newFileName!=null && oldFileName!=null && !oldFileName.isEmpty()){
                File delOldFile = new File(saveDir, oldFileName);
                if(delOldFile.exists()){
                    delOldFile.delete();
                }
            }

        } catch (Exception e) {
            // 새롭게 저장된 파일 삭제
            if(newFileName!=null){
                File delFile = new File(saveDir, newFileName);
                if(delFile.exists()){
                    delFile.delete(); // 파일 삭제
                }
            }
        }

        return result;
    }

/*
    public int edit(BoardEditRequest boardEditRequest){

        MultipartFile file = boardEditRequest.getFormFile();
        File saveDir = null;
        String newFileName = null;

        if(file!=null && !file.isEmpty()){
            // 새로운 파일을 저장
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

        BoardDTO boardDTO = boardEditRequest.toBoardDTO();
        if(newFileName!=null){
            boardDTO.setPhoto(newFileName);
        }

        int result = 0;

        try {
            // db update
            result = boardMapper.update(boardDTO);

            // 새로운 파일이 저장되고, 이전 파일이 존재한다면 이전 파일을 삭제
            String oldFileName = boardEditRequest.getOldFile();
            if(newFileName!=null && oldFileName!=null && !oldFileName.isEmpty()){
                File delOldFile = new File(saveDir, oldFileName);
                if(delOldFile.exists()){
                    delOldFile.delete();
                }
            }

        } catch (SQLException e) {
            // 새롭게 저장된 파일 삭제
            if(newFileName!=null){
                File delFile = new File(saveDir, newFileName);
                if(delFile.exists()){
                    delFile.delete(); // 파일 삭제
                }
            }
        }

        return result;
    }
*/

    
}
