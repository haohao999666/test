package com.neusoft.dao;

import com.neusoft.entity.OfferPrice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfferPriceDaoImpl  implements OfferPriceDao{
  private   final String  URL="jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
public  List<OfferPriceDao> findByEe_date(String ee_date)throws SQLException{
        Connection connection  =null;
       PreparedStatement preparedStatement= null;
        ResultSet resultSet=null;
       OfferPrice offerPrice=null;
     List<OfferPriceDao> offerPriceDaos = new ArrayList<>();
        try {
            connection= DriverManager.getConnection(URL);
            final String SQL = "select  * from offerprice WHERE ee_date >?;";
            preparedStatement =connection.prepareStatement(SQL);
            preparedStatement.setString(1,"2020-7-12");
            resultSet = preparedStatement.executeQuery();
            System.out.println("ofe_id|p_id|es_date|ee_date");
            while (resultSet.next()){
               offerPriceDaos.add((OfferPriceDao) new OfferPrice(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4)));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            if (connection == null) {
                connection.close();
            }
            if (preparedStatement == null) {
                preparedStatement.close();
            }
            if (resultSet == null) {
                resultSet.close();
            }
        }
        return offerPriceDaos;
    }
}
