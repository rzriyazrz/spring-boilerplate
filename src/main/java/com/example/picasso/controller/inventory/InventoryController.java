package com.example.picasso.controller.inventory;

import com.example.picasso.dto.inventory.InventoryCreateRequestDTO;
import com.example.picasso.dto.inventory.InventoryCreateResponseDTO;
import com.example.picasso.service.inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @PostMapping
    public String createInventory(@RequestBody InventoryCreateRequestDTO body){
//        inventoryService.saveInventory(body.getTitle(), body.getDesc());
//        InventoryCreateResponseDTO response = new InventoryCreateResponseDTO("Successfully Created Inventory");
//        return new ResponseEntity<InventoryCreateResponseDTO>(response, HttpStatusCode.valueOf(201));
        System.out.println(body.getTitle());
        return "success";



    }



}
