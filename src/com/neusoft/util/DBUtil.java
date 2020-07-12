package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
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
   
    public static Connection getConnection(String DB ,String URL, String USER,String PASSWORD) throws SQLException {
        return DriverManager.getConnection(URL+DB+"?user"+USER+"&password"+ PASSWORD);

    }
    public static Connection getConnection(String URL,  String USER,String PASSWORD) throws SQLException {
        return DriverManager.getConnection(URL+"?user"+USER+"&password"+ PASSWORD);

    }
    public static Connection getConnection(String URL) throws SQLException {
        return DriverManager.getConnection(URL);

    }


}
