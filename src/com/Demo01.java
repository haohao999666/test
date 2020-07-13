package com;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws  SQLException{
        final String  URL="jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
        Connection connection  =null;
        Statement statement =null;
        ResultSet resultSet=null;
        try {

          connection= DriverManager.getConnection(URL);
          statement = connection.createStatement();
          resultSet =statement.executeQuery("select  e1.EMPNO,rpad(e1.ENAME,6,' ') ,rpad(truncate( e1.SAL,0),4,' '),e1.MGR,rpad(e2.ENAME,6,' ')\n" +
                  "from  emp e1\n" +
                  "    left join dept d on e1.DEPTNO = d.DEPTNO\n" +
                  "    left join emp e2 on e1.MGR=e2.EMPNO where  LOC like 'CHICAGO';");
            System.out.println("empno | ename | sal | mgr | mname ");
            while (resultSet.next()){
                System.out.printf( "%d\t%s\t%s\t%d\t%s%n",resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getString(5));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            if (connection==null){
                connection.close();
            }
            if (statement == null){
                statement.close();
            }
            if (resultSet==null){
                resultSet.close();
            }
        }
    }
}
