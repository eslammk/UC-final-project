package com.example.bemyhome;

import java.io.Serializable;

public class Types implements Serializable {

    private String nameeeItem;
    private double priceeeItem;
    private int imgeeItem;
    private String addddItem;
    private String descccItem;


    public Types() {
    }

    public Types(String descccItem) {
        this.descccItem = descccItem;
    }

    public String getDescccItem() {
        return descccItem;
    }

    public void setDescccItem(String descccItem) {
        this.descccItem = descccItem;
    }

    public Types(String nameeeItem, double priceeeItem, int imgeeItem , String addddItem) {
        this.nameeeItem = nameeeItem;
        this.priceeeItem = priceeeItem;
        this.imgeeItem = imgeeItem;
        this.addddItem = addddItem;
    }

    public String getAddddItem() {
        return addddItem;
    }

    public void setAddddItem(String addddItem) {
        this.addddItem = addddItem;
    }

    public String getNameeeItem() {
        return nameeeItem;
    }

    public void setNameeeItem(String nameeeItem) {
        this.nameeeItem = nameeeItem;
    }

    public double getPriceeeItem() {
        return priceeeItem;
    }

    public void setPriceeeItem(double priceeeItem) {
        this.priceeeItem = priceeeItem;
    }

    public int getImgeeItem() {
        return imgeeItem;
    }

    public void setImgeeItem(int imgeeItem) {
        this.imgeeItem = imgeeItem;
    }
}
