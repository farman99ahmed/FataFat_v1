package com.example.fatafat;

public class Product {
    private int id;
    private String item;
    private int price;
    private String category;

    public Product(int id, String item, int price, String category) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }

}
