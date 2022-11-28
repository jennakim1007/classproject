package com.todo.todospring.service;

import com.todo.todospring.dao.MemberDao;
import com.todo.todospring.dao.MemberDaoImpl;
import com.todo.todospring.domain.Member;
import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.mapper.MemberMapper;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

@Service
@Log4j2
public class MemberRegService {

    // 사용자 요청 데이터를 받고, 파일 업로드 처리, Dao insert 요청
    @Autowired
    private MemberMapper memberMapper;

    @Transactional
    public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) throws Exception {

        String newFileName = null;

        // 파일 업로드 처리 여부 체크
        if(        regRequest.getUphoto()!=null
                && !regRequest.getUphoto().isEmpty()
                && regRequest.getUphoto().getSize()>0){

            // 1. uri 정의 : 저장할 폴더
            String dirURI = "/uploadfile/member";
            // 2. 시스템의 절대 경로
            String dirRealPath = request.getSession().getServletContext().getRealPath(dirURI);
            log.info(dirRealPath);

            newFileName = System.nanoTime() + regRequest.getUphoto().getOriginalFilename();
            log.info(newFileName);

            // 3. 저장
            try {
                regRequest.getUphoto().transferTo(new File(dirRealPath, newFileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        Member member = regRequest.toMember();

        if(newFileName!=null){
            member.setUphoto(newFileName);
        }
        log.info(member);

        return memberMapper.insertMember(member);

    }

}
