package com.example.picasso.dto.inventory;

public class InventoryCreateResponseDTO {

    private String message;

    public InventoryCreateResponseDTO(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
