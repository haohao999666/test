package com.neusoft.service;

import com.neusoft.dao.OfferPriceDao;
import com.neusoft.dao.OfferPriceDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class OfferPriceServiceImpl implements OfferPriceService {
    OfferPriceDao offerPriceDao = new OfferPriceDaoImpl();


    @Override
    public List<OfferPriceDao> findByEe_date(String ee_date) throws SQLException {
        return offerPriceDao.findByEe_date(ee_date);
    }
}
