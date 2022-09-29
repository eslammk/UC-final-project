package com.example.bemyhome;

import java.io.Serializable;
public class Lists implements Serializable {

    private String nameeItem;
    private double priceeItem;
    private int imggItem;
    private String adddItem;
    private String desccItem;


    public Lists() {
    }

    public Lists(String desccItem) {
        this.desccItem = desccItem;
    }

    public Lists(String nameeItem, double priceeItem, int imggItem, String adddItem ) {
        this.nameeItem = nameeItem;
        this.priceeItem = priceeItem;
        this.imggItem = imggItem;
        this.adddItem = adddItem;

    }

    public String getNameeItem() {
        return nameeItem;
    }

    public void setNameeItem(String nameeItem) {
        this.nameeItem = nameeItem;
    }

    public double getPriceeItem() {
        return priceeItem;
    }

    public void setPriceeItem(double priceeItem) {
        this.priceeItem = priceeItem;
    }

    public int getImggItem() {
        return imggItem;
    }

    public void setImggItem(int imggItem) {
        this.imggItem = imggItem;
    }

    public String getAdddItem() {
        return adddItem;
    }

    public void setAdddItem(String adddItem) {
        this.adddItem = adddItem;
    }

    public String getDesccItem() {
        return desccItem;
    }

    public void setDesccItem(String desccItem) {
        this.desccItem = desccItem;
    }
}