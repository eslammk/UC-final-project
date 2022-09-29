package com.example.bemyhome;

import java.io.Serializable;

public class Items implements Serializable {

    private String nameItem;
    private double priceItem;
    private int imgItem;
    private String addItem;
    private String descItem;


    public Items() {
    }

    public Items(String descItem) {
        this.descItem = descItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public Items(String nameItem, double priceItem, int imgItem , String addItem ) {
        this.nameItem = nameItem;
        this.priceItem = priceItem;
        this.imgItem = imgItem;
        this.addItem = addItem ;

    }


    public String getAddItem() {
        return addItem;
    }

    public void setAddItem(String addItem) {
        this.addItem = addItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}