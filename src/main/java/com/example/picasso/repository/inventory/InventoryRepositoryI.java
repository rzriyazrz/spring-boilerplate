package com.example.picasso.repository.inventory;

import com.example.picasso.model.inventory.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InventoryRepositoryI extends MongoRepository<Inventory,String> {
    @Query("{'title': { $regex: /?0/ }, 'category': { $in: ?1 }, 'brand': { $in: ?2 } }")
    List<Inventory> findByfilters(String search,List<String> categories,List<String> brands);




}
