package com.example.picasso.service.inventory;

import com.example.picasso.model.inventory.Inventory;
import com.example.picasso.repository.inventory.InventoryRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    InventoryRepositoryI inventoryRepositoryI;

    public void saveInventory(String title,String desc){
        Inventory inventory = new Inventory(title, desc);
        inventoryRepositoryI.save(inventory);
    }
    public void searchInventory(){
        //TODO
    }
    public void deleteInventory(String id){
        inventoryRepositoryI.deleteById(id);
    }

}
