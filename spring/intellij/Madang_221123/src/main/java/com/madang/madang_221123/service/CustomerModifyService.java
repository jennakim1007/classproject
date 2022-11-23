package com.madang.madang_221123.service;

import com.madang.madang_221123.dao.CustomerDao;
import com.madang.madang_221123.domain.Customer;
import com.madang.madang_221123.util.ConnectionProvider;
import lombok.Cleanup;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Service
public class CustomerModifyService {

    private final CustomerDao dao;


    public CustomerModifyService(CustomerDao dao) {
        this.dao = dao;
    }

    public int customerModify(Customer customer) throws SQLException {

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return dao.updateCustomer(conn, customer);

    }


}
