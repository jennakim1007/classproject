package com.madang.madang_221123.service;

import com.madang.madang_221123.dao.CustomerDao;
import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@Service
public class LoginService {

    private final CustomerDao dao;

    public LoginService(CustomerDao dao) {
        this.dao = dao;
    }

    public Customer login(int custid, String name) throws SQLException {

        log.info("LoginService login()...");
        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return dao.selectByCustidName(conn, custid, name);

    }



}
