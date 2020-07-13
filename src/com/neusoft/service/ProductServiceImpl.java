package com.neusoft.service;

import com.neusoft.dao.ProductDao;
import com.neusoft.dao.ProductDaoImpl;
import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    ProductDao productDao= new ProductDaoImpl();
    @Override
    public List<Product> findByTitle(String tltle) throws SQLException {
        return productDao.findByTitle(tltle);
    }
}
