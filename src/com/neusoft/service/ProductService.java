package com.neusoft.service;

import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    List<Product> findByTitle(String tltle) throws SQLException;
}
