package com.firstcoding.todo221114.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String dbUrl = "jdbc:mysql://localhost:3306/project";

        Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");

        return conn;

    }

}
