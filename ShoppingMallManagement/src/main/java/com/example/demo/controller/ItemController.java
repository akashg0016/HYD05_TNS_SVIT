package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	 @PostMapping("/items")
	    public Item saveDepartment(@RequestBody Item item) {
	       
	        return itemService.saveItem(item);
	    }
	    

	    @GetMapping("/items")
	    public List<Item> fetchItem() {
	        //LOGGER.info("Inside fetchItemList of DepartmentController");
	        return itemService.fetchItem();
	    }
	    


	    @GetMapping("/items/{id}")
	    public Item fetchById(@PathVariable("id") Long id)
	            {
	        return itemService.fetchById(id);
	    }
	    
	    @DeleteMapping("/items/{id}")
	    public String deleteItemById(@PathVariable("id") Long id) {
	        itemService.deleteItemById(id);
	        return "Item deleted Successfully!!";
	    }
	    
	    @PutMapping("/items/{id}")
	    public Item updateItem(@PathVariable("id") Long id,
	                                       @RequestBody Item item) {
	        return itemService.updateItem(id,item);
	    }
	
}
