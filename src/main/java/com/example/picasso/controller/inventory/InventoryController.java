package com.example.picasso.controller.inventory;

import com.example.picasso.dto.inventory.InventoryCreateRequestDTO;
import com.example.picasso.dto.inventory.InventoryCreateResponseDTO;
import com.example.picasso.dto.inventory.InventoryFetchRequestDTO;
import com.example.picasso.dto.inventory.InventoryUpdateRequestDTO;
import com.example.picasso.model.inventory.Filter;
import com.example.picasso.model.inventory.Inventory;
import com.example.picasso.service.inventory.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;
    @PostMapping
    public ResponseEntity<InventoryCreateResponseDTO> createInventory(@RequestBody InventoryCreateRequestDTO body){
        inventoryService.saveInventory(body.getTitle(),body.getDesc(), body.getName(), body.getPrice(), body.getCurrentStock(), body.getItemsSold(), body.getDiscount(), body.getCategory(),body.getBrand());

        InventoryCreateResponseDTO response = new InventoryCreateResponseDTO("Successfully Created Inventory");
        return new ResponseEntity<InventoryCreateResponseDTO>(response, HttpStatusCode.valueOf(201));


    }
    @DeleteMapping("/{id}")
    public ResponseEntity<InventoryCreateResponseDTO> deleteInventory(@PathVariable("id") String id){
        inventoryService.deleteInventory(id);
        InventoryCreateResponseDTO response = new InventoryCreateResponseDTO("Successfully Deleted Inventory");
        return new ResponseEntity<InventoryCreateResponseDTO>(response,HttpStatusCode.valueOf(200));
    }

    @PostMapping("/all")
    public ResponseEntity<List<Inventory>> fetchInventory(@RequestBody InventoryFetchRequestDTO body) {
        String search = body.getSearch();
        List<Filter> filters = body.getFilters();
        int pageSize = body.getPageSize();
        String sort = body.getSort();
        String sortKey = body.getSortKey();
        int page = body.getPage();

        List<Inventory> response = inventoryService.getInventories(search,filters,pageSize,sort,sortKey,page);
        return new ResponseEntity<List<Inventory>>(response, HttpStatus.OK);

    }

//    @PutMapping("/{update}")
//    public ResponseEntity<Inventory> updateInventory(@RequestParam String id,@RequestParam String name,@RequestBody Inventory body){
//        inventoryService.updateInventory(id,name);
////        System.out.println(name);
////        System.out.println(body.getName());
//
//        return new ResponseEntity<Inventory>(body,HttpStatus.OK);
//
//
//    }
    @PutMapping("/{id}")
        public ResponseEntity<Inventory> updateInventory(@PathVariable("id") String id,@RequestBody InventoryUpdateRequestDTO body ){
            Inventory inventory = inventoryService.updateInventory(id,body);
            InventoryCreateResponseDTO response = new InventoryCreateResponseDTO("successfully updated the name.");
            return new ResponseEntity<Inventory>(inventory,HttpStatus.OK);

    }




}

