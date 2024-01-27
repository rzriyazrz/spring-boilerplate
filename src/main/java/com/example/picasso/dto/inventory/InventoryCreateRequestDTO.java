package com.example.picasso.dto.inventory;

public class InventoryCreateRequestDTO {

    private String title;
    private String desc;

    private String name;
    private double price;
    private int currentStock;
    private int itemsSold;
    private float discount;
    private String category;

    private String brand;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public float getDiscount() {
        return discount;
    }

    public String getCategory() {
        return category;
    }

    public InventoryCreateRequestDTO(String title, String desc, String name, double price, int currentStock, int itemsSold, float discount, String category) {
        this.title = title;
        this.desc = desc;
        this.name = name;
        this.price = price;
        this.currentStock = currentStock;
        this.itemsSold = itemsSold;
        this.discount = discount;
        this.category = category;
    }

//    public InventoryCreateRequestDTO(String title, String desc) {
//        this.title = title;
//        this.desc = desc;
//    }
//    public String getTitle() {
//        return this.title;
//    }
//    public String getDesc() {
//        return this.desc;
//    }

}
