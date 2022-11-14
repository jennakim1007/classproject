package com.firstcoding.todo221114.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class ConnectionUtil {

    private HikariDataSource ds;

    private static ConnectionUtil instacne = new ConnectionUtil();

    private ConnectionUtil(){

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/project");
        config.setUsername("scott");
        config.setPassword("tiger");
        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);

        ds = new HikariDataSource(config);

    }

    public static ConnectionUtil getInstance(){
        return instacne;
    }

    public Connection getConnection() throws Exception {
        return ds.getConnection();
    }

}
