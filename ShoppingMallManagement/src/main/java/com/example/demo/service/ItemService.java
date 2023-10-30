package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Item;

public interface ItemService {

	public Item saveItem(Item item);

	public List<Item> fetchItem();

	public Item fetchById(Long id);
	
	public void deleteItemById(Long id);

	public Item updateItem(Long id, Item item);

	

	
	
}
