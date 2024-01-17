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


    public Inventory(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
