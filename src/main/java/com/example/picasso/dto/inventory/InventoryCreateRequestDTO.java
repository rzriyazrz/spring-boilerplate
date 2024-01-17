package com.example.picasso.dto.inventory;

public class InventoryCreateRequestDTO {

    private String title;
    private String desc;

    public InventoryCreateRequestDTO(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
    public String getTitle() {
        return this.title;
    }
    public String getDesc() {
        return this.desc;
    }

}
