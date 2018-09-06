package com.galvanize.model;

public class Snack {

    private long id;
    private String name;
    private float price;
    private String img;
    private boolean is_perishable;

    public Snack(long id, String name, String description, float price, String img, boolean is_perishable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.img = img;
        this.is_perishable = is_perishable;
    }

    public Snack() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isIs_perishable() {
        return is_perishable;
    }

    public void setIs_perishable(boolean is_perishable) {
        this.is_perishable = is_perishable;
    }




}


