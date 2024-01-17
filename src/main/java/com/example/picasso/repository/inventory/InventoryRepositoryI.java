package com.example.picasso.repository.inventory;

import com.example.picasso.model.inventory.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepositoryI extends MongoRepository<Inventory,String> {
}
