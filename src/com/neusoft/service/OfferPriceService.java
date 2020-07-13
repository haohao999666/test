package com.neusoft.service;

import com.neusoft.dao.OfferPriceDao;

import java.sql.SQLException;
import java.util.List;

public interface OfferPriceService {

    List<OfferPriceDao> findByEe_date(String ee_date)throws SQLException;
}
