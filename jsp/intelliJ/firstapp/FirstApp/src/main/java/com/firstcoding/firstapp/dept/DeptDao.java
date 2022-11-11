package com.firstcoding.firstapp.dept;

import com.mysql.cj.protocol.Resultset;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {

    public List<Dept> selectAll(Connection conn) throws SQLException{

        String sql = "Select * from dept";
        // @Cleanup 사용하면 자동으로 닫아줌
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        List<Dept> result = new ArrayList<>();

        // pstmt = conn.prepareStatement(sql);
        // rs = pstmt.executeQuery();
        // result = new ArrayList<>();
        while(rs.next()){
            result.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }

        return result;

    }


}



