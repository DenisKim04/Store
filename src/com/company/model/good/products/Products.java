package com.company.model.good.products;


public abstract class Products{
    private int id;
    private String name;
    private double price;
    private boolean availability;


    public Products() {
    }

    public Products(int id, String name, double price, boolean availability) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double isPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
