package com.madang.madang_221123.dao;

import com.madang.madang_221123.domain.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    List<Customer> selectAll(Connection conn);

    Customer selectByCustidName(Connection conn, int custid, String name) throws SQLException;

    int insertCustomer(Connection conn, Customer customer) throws SQLException;

    int updateCustomer(Connection conn, Customer customer) throws SQLException;

    int deleteCustomer(Connection conn, Customer customer);

}
