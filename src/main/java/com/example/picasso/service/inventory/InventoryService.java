package com.example.picasso.service.inventory;

import com.example.picasso.dto.inventory.InventoryUpdateRequestDTO;
import com.example.picasso.model.inventory.Filter;
import com.example.picasso.model.inventory.Inventory;
import com.example.picasso.repository.inventory.InventoryRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class InventoryService {

    @Autowired
    InventoryRepositoryI inventoryRepositoryI;

    public void saveInventory(String title, String desc, String name, double price, int currentStock, int itemsSold, float discount, String category, String brand) {
        Inventory inventory = new Inventory(title, desc, name, price, currentStock, itemsSold, discount, category, brand);
        inventoryRepositoryI.save(inventory);
    }

    public void deleteInventory(String id) {
        inventoryRepositoryI.deleteById(id);
    }

    public List<Inventory> getInventories(String search, List<Filter> filters, int pageSize, String sort, String sortKey, int page) {
        List<String> categories = new ArrayList<>();
        List<String> brands = new ArrayList<>();

        for (Filter filter : filters) {
            if (filter.getKey().equals("category"))
                categories = filter.getValues();
            else if (filter.getKey().equals("brand"))
                brands = filter.getValues();

        }

        List<Inventory> inventories = inventoryRepositoryI.findByfilters(search, categories, brands);
        return inventories;
    }
//    public void updateInventory(String id,String name){
//        inventoryRepositoryI.updatenameById(id,name);}

    public Inventory updateInventory(String id, InventoryUpdateRequestDTO body) {
        Optional<Inventory> inventory = inventoryRepositoryI.findById(id);
        Inventory updatedInventory = null;
        if (inventory.isPresent()) {
            Inventory dbInventory = inventory.get();
            dbInventory.setName(body.getName());
            updatedInventory = inventoryRepositoryI.save(dbInventory);
        }
        return updatedInventory;
    }





}
