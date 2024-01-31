package com.example.picasso.dto.inventory;

public class InventoryUpdateRequestDTO {
    String id;
    String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public InventoryUpdateRequestDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
