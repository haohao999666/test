package text.com.neusoft.util;

import com.neusoft.dao.OfferPriceDao;
import com.neusoft.entity.Product;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementTest {

    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
@Test
   void findByEe_date(String ee_date)throws SQLException {
    Connection connection  =null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    try {
        connection= DriverManager.getConnection(URL);
        final String SQL = "select  * from offerprice WHERE ee_date >?;";
        preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1,"2020-7-12");
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.printf( "%d\t%d\t%s%n",resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3));
        }
    }catch (SQLException throwables){
        throwables.printStackTrace();
    }finally {
        if (connection==null){
            connection.close();
        }
        if (preparedStatement ==null){
            preparedStatement.close();
        }
        if (resultSet==null){
            resultSet.close();
        }
    }

}
}
