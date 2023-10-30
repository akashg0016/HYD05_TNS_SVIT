package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepo itemRepo;
	
	@Override
	public Item saveItem(Item item) 
	{
		
		return itemRepo.save(item);
	}
	
	@Override
	public List<Item> fetchItem()
	{
		return itemRepo.findAll();
	}
	
	@Override
	public Item fetchById(Long id)
	{
		return itemRepo.findById(id).get();
	}
	
	
	@Override
	public void deleteItemById(Long id)
	{
		itemRepo.deleteById(id);
	}
	
	@Override
	public Item updateItem(Long id, Item item)
	{
		Item itemDB = itemRepo.findById(id).get();

	       if(Objects.nonNull(item.getItemName()) &&
	       !"".equalsIgnoreCase(item.getItemName())) {
	    	   itemDB.setItemName(item.getItemName());
	       }

	       if (item.getPrice() >0) {
	            itemDB.setPrice(item.getPrice());
	        }

	       // itemDB.setPrice(item.getPrice());
	       
	        if (item.getManufacturingDate() != null) {
	            itemDB.setManufacturingDate(item.getManufacturingDate());
	        }

	        if (item.getExpiry() != null) {
	            itemDB.setExpiry(item.getExpiry());
	        }

	       
	       
	       return itemRepo.save(itemDB);
	}
	
	
	
	
	
	
	
	
}
