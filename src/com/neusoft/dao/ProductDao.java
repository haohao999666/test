package com.neusoft.dao;

import com.neusoft.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
 List<Product> findByTitle(String tltle) throws SQLException;
}
