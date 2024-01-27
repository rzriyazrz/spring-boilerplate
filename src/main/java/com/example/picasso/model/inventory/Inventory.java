package com.example.picasso.model.inventory;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter

@Document(collection = "inventory")
public class Inventory {

    @Id
    private String id;

    private String title;
    private String desc;
    private String name;
    private double price;
    private int currentStock;
    private int itemsSold;
    private float discount;
    private String category;
    private String brand;


    public Inventory(String title, String desc, String name, double price, int currentStock, int itemsSold, float discount, String category,String brand) {
        this.title = title;
        this.desc = desc;
        this.name = name;
        this.price = price;
        this.currentStock = currentStock;
        this.itemsSold = itemsSold;
        this.discount = discount;
        this.category = category;
        this.brand = brand;
    }
}
