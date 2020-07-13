package text.com.neusoft.util;

import com.neusoft.util.DBUtil;
import org.junit.Test;

import javax.print.DocFlavor;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilTest {
    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
    public void arrtest() throws SQLException{
        Connection connection = null;
        Statement   statement = null;
        ResultSet   resultSet = null;
        try {
            connection=DBUtil.getConnection(URL);
            statement  = connection.createStatement();
            final  String  SQL = "select 1+1";
            resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        } finally {
          if (connection==null){
              connection.close();
          }if (statement==null){
              statement.close();
            }if (resultSet==null){
              resultSet.close();
            }
        }
    }

      public void excuteTest() throws  SQLException {
           Connection connection = null;
           Statement statement = null;
           try {
               connection = DBUtil.getConnection(URL);
               statement = connection.createStatement();
               final String SQL1 = "cteate database if not exists  test;";
               statement.execute(SQL1);
               final String SQL3 = " user test;";
               statement.execute(SQL3);
               final String SQL4 = " create table  student(\n" +
                       "     stu_no int primary key auto_increment,\n" +
                       "     stu_name varchar(5) not null ,\n" +
                       "     major varchar(10)\n" +
                       " );";
               statement.execute(SQL4);
           } catch (SQLException throwables) {
               throwables.printStackTrace();
           } finally {
               if (connection == null) {
                   connection.close();
               }
               if (statement == null) {
                   statement.close();
               }
           }
       }

     public void insertTest() throws  SQLException {
         Connection connection = null;
         Statement statement = null;
         try {
             connection = DBUtil.getConnection(URL);
             statement = connection.createStatement();
             final String SQL = "insert into student values (null ,'张三','java'),(null,'李四'，null)";
             statement.execute(SQL);
         } catch (SQLException throwables) {
             throwables.printStackTrace();
         } finally {
             if (connection == null) {
                 connection.close();
             }
             if (statement == null) {
                 statement.close();
             }
         }
     }

     public void updateTest() throws  SQLException {
         Connection connection = null;
         Statement statement = null;
         try {
             connection = DBUtil.getConnection(URL);
             statement = connection.createStatement();
             final String SQL = "insert into student values (null ,'张三','java'),(null,'李四'，null)";
             statement.execute(SQL);
         } catch (SQLException throwables) {
             throwables.printStackTrace();
         } finally {
             if (connection == null) {
                 connection.close();
             }
             if (statement == null) {
                 statement.close();
             }
         }
    }
    public class  Test{

          {
              try {
                  Class.forName("org.mariadb.jdbc.Driver");
              } catch (ClassNotFoundException e){
                  e.printStackTrace();
              }
          }

    }
    public static void main(String[] args) throws  SQLException {
        DBUtilTest dbUtilTest= new DBUtilTest();
        dbUtilTest.arrtest();
        dbUtilTest.excuteTest();
        dbUtilTest.insertTest();
        dbUtilTest.updateTest();

    }

}
