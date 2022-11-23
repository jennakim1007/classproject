package com.madang.madang_221123.dao;

import com.madang.madang_221123.domain.Customer;
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
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public List<Customer> selectAll(Connection conn) {
        return null;
    }

    @Override
    public Customer selectByCustidName(Connection conn, int custid, String name) throws SQLException {

        String sql = "select * from customer where custid=? and name=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, custid);
        pstmt.setString(2, name);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        Customer customer = null;
        if(rs.next()){
            customer = Customer.builder().custid(rs.getInt("custid")).name(rs.getString("name"))
                    .address(rs.getString("address")).phone(rs.getString("phone")).build();
        }
        return customer;

    }

    @Override
    public int insertCustomer(Connection conn, Customer customer) throws SQLException {

        String sql = "insert into customer (custid, name, address, phone) values (?,?,?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, customer.getCustid());
        pstmt.setString(2, customer.getName());
        pstmt.setString(3, customer.getAddress());
        pstmt.setString(4, customer.getPhone());
        return pstmt.executeUpdate();

    }

    @Override
    public int updateCustomer(Connection conn, Customer customer) throws SQLException {

        String sql = "update customer set name=?, address=?, phone=? where custid=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, customer.getName());
        pstmt.setString(2, customer.getAddress());
        pstmt.setString(3, customer.getPhone());
        pstmt.setInt(4, customer.getCustid());
        return pstmt.executeUpdate();

    }

    @Override
    public int deleteCustomer(Connection conn, Customer customer) {
        return 0;
    }

}
