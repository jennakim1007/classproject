package com.todo.todospring.dao;

import com.todo.todospring.domain.MemberDTO;
import jdk.jpackage.internal.Log;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Log4j2
public class MemberDaoImpl implements MemberDao{
    @Override
    public List<MemberDTO> selectAll(Connection conn) {
        return null;
    }

    @Override
    public MemberDTO selectbyIdPw(Connection conn, String uid, String pw) throws SQLException {

        log.info("MemberDaoImpl selectbyIdPw...");
        String sql = "select * from member where uid=? and pw=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, uid);
        pstmt.setString(2, pw);
        ResultSet rs = pstmt.executeQuery();
        MemberDTO dto = null;
        if(rs.next()){
            dto = new MemberDTO(rs.getInt("idx"), rs.getString("uid"), rs.getString("pw"), rs.getString("uname"), rs.getString("uphoto"));
            // 또는 build 사용 가능
        }
        return dto;
    }

    @Override
    public int insertMember(Connection conn, MemberDTO dto) throws SQLException {

        log.info("MemberDaoImpl insertMember...");
        String sql = "insert into member (uid,pw,uname,uphoto) values (?,?,?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getUid());;
        pstmt.setString(2, dto.getPw());
        pstmt.setString(3, dto.getUname());
        pstmt.setString(4, dto.getUphotoName());
        return pstmt.executeUpdate();

    }

    @Override
    public int deleteMember(Connection conn, MemberDTO dto) {
        return 0;
    }

    @Override
    public int updateMember(Connection conn, MemberDTO dto) {
        return 0;
    }
}
