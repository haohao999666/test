package com.neusoft.entity;

public class Product {
   private  Integer p_id;
   private  Integer p_no;
   private  String  title;
    public  Product(){

    }
   public  Product(Integer p_id ,Integer p_no, String title){
        this.p_id=p_id;
        this.p_no=p_no;
        this.title=title;
   }
    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getP_no() {
        return p_no;
    }

    public void setP_no(Integer p_no) {
        this.p_no = p_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "product{" +
                "p_id=" + p_id +
                ", p_no=" + p_no +
                ", title='" + title + '\'' +
                '}';
    }
}
