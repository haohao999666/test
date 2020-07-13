package com.neusoft.entity;

public class OfferPrice {
    private   Integer ofp_id;  // id 价格主键
    private  Integer p_id;     //外键
    private  String  es_date;  //价格有效起的开始时间
    private  String ee_date;   //结束时间
    private  double  price;    // 单价
    private  String typecd;    // 价格单价
    public OfferPrice(){

    }
    public OfferPrice(int anInt, int resultSetInt, String string, String resultSetString){
        this.ofp_id=ofp_id;
        this.p_id=p_id;
        this.es_date =es_date;
        this.ee_date=ee_date;
    }
    public OfferPrice(Integer ofp_id,Integer p_id,String  es_date,String ee_date,double  price,String typecd){
        this.ofp_id=ofp_id;
        this.p_id=p_id;
        this.es_date =es_date;
        this.ee_date=ee_date;
        this.price=price;
        this.typecd=typecd;
    }

    public Integer getOfp_id() {
        return ofp_id;
    }

    public void setOfp_id(Integer ofp_id) {
        this.ofp_id = ofp_id;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getEs_date() {
        return es_date;
    }

    public void setEs_date(String es_date) {
        this.es_date = es_date;
    }

    public String getEe_date() {
        return ee_date;
    }

    public void setEe_date(String ee_date) {
        this.ee_date = ee_date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getTypecd() {
        return typecd;
    }

    public void setTypecd(String typecd) {
        this.typecd = typecd;
    }

    @Override
    public String toString() {
        return "OfferPrice{" +
                "ofp_id=" + ofp_id +
                ", p_id=" + p_id +
                ", es_date='" + es_date + '\'' +
                ", ee_date='" + ee_date + '\'' +
                ", price='" + price + '\'' +
                ", typecd='" + typecd + '\'' +
                '}';
    }
}
