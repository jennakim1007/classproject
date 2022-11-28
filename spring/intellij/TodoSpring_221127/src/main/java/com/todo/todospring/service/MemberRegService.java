package com.todo.todospring.service;

import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.mapper.MemberMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Log4j2
@Service
public class MemberRegService {

    @Autowired
    private MemberMapper memberMapper;

    public int memberReg(MemberDTO dto, HttpServletRequest request){

        String newFileName = null;

        if(dto.getUphoto()!=null && !dto.getUphoto().isEmpty() && dto.getUphoto().getSize()>0){
            // 저장할 폴더 지정
            String dirURI = "/uploadfile/member";
            // 절대 경로
            String dirRealPath = request.getSession().getServletContext().getRealPath(dirURI);
            log.info(dirRealPath);

            newFileName = System.nanoTime() + dto.getUphoto().getOriginalFilename();
            log.info(newFileName);

            try {
                dto.getUphoto().transferTo(new File(dirRealPath, newFileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        MemberDTO member = dto.toMember();

        // MultipartFile 타입 uphoto 파일이 있다면 String 타입 uphotoName 을 새로 넣어주었음.
        if(newFileName!=null){
            member.setUphotoName(newFileName);
        }

        return memberMapper.insertMember(dto);

    }


}
