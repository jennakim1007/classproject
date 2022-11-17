package com.firstcoding.todo221117.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String dbUrl = "jdbc:mysql://localhost:3306/project";

        Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");

        return conn;

    }

}
