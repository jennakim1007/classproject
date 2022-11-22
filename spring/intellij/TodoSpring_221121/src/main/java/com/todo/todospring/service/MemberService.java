package com.todo.todospring.service;

import com.todo.todospring.dao.MemberDaoImpl;
import com.todo.todospring.domain.MemberDTO;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;

@Service
@Log4j2
public class MemberService {

    private final MemberDaoImpl memberDao;

    public MemberService(MemberDaoImpl memberDao) {
        this.memberDao = memberDao;
    }

    public int memberReg(MemberDTO dto, HttpServletRequest request) throws Exception {

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

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return memberDao.insertMember(conn, member);

    }

    public MemberDTO login(String uid, String pw) throws Exception {
        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return memberDao.selectbyIdPw(conn, uid, pw);
    }







}
