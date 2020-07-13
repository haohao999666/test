package com.neusoft.controller;

import com.neusoft.dao.OfferPriceDao;
import com.neusoft.dao.OfferPriceDaoImpl;
import com.neusoft.dao.ProductDao;
import com.neusoft.dao.ProductDaoImpl;

import java.sql.*;

public class controller {
    private static String title;

    /*  private final String STATICURL = "jdbc:mariadb://localhost:3306/mysqldb?user=root&password=mariadb";
        private final String DBURL = "jdbc:mariadb://localhost:3306/";
        private static final String URL = "jdbc:mariadb://localhost:3306/mysqldb";
        private final String DB = "test";
        private final String USER = "root";
        private  final String PASSWORD = "mariadb";*/
  public static void main(String[] args) {
      OfferPriceDao offerPriceDao = new OfferPriceDaoImpl();
      try {
         offerPriceDao.findByEe_date("2020-7-12");
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }
      ProductDao productDao= new ProductDaoImpl();
      try {
          productDao.findByTitle(title);
      }catch (SQLException throwables){
          throwables.printStackTrace();
      }

  }



}
