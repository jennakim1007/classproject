package com.madang.madang_221123.service;

import com.madang.madang_221123.dao.CustomerDao;
import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
@Log4j2
public class CustomerInsertService {

    private final CustomerDao dao;

    public CustomerInsertService(CustomerDao dao) {
        this.dao = dao;
    }

    public int customerRegister(Customer customer) throws SQLException {

        log.info("CustomerInsertService customerRegister()...");
        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return dao.insertCustomer(conn, customer);

    }

}
