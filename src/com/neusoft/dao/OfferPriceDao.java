package com.neusoft.dao;

import java.sql.SQLException;
import java.util.List;

public interface OfferPriceDao {
    List<OfferPriceDao> findByEe_date(String ee_date)throws SQLException;

    }
