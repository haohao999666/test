package com.neusoft.dao;

import com.neusoft.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private final String URL = "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
    public List<Product> findByTitle(String tltle) throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        List<Product> products = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(URL);
            final String SQL= "select  * from student where title = ?";
            preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,tltle);
            resultSet = preparedStatement.executeQuery();
            System.out.println("p_id|p_no|title");
            while (resultSet.next()) {
              products.add (new Product(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
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
        return  products ;
    }
}
