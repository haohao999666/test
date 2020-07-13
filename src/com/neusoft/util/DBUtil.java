package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static {
        try {
                Class.forName("org.mariadb.jdbc.Driver");
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            }
    }

    public static Connection getConnection( String URL) throws SQLException {
        return DriverManager.getConnection(URL);
    }
    public static Connection getConnection(String DB,String DBURL,String USER) throws SQLException {
        return DriverManager.getConnection(DB+DBURL+"?USER"+USER);
    }
    public static Connection getConnection(String DB,String DBURL,String USER ,String PASSWORD) throws SQLException {
        return DriverManager.getConnection(DB+DBURL+"?USER"+USER+"&password"+PASSWORD);
    }


    /* static {
     HkariConfig config = new HikariConfig();
config.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
config.setUsername("bart");
config.setPassword("51mp50n");
config.addDataSourceProperty("cachePrepStmts", "true");
config.addDataSourceProperty("prepStmtCacheSize", "250");
config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

HikariDataSource ds = new HikariDataSource(config);

  }*/

}