package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
		private String itemName;
		private double price;
		
		@JsonFormat(pattern = "dd-MM-yyyy")
		private LocalDate manufacturingDate;
		
		@JsonFormat(pattern = "dd-MM-yyyy")
		private LocalDate expiry;
	//	private enum category{ CLOTHING, MOBILES, ACCESSIORIES }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public LocalDate getManufacturingDate() {
			return manufacturingDate;
		}
		public void setManufacturingDate(LocalDate manufacturingDate) {
			this.manufacturingDate = manufacturingDate;
		}
		public LocalDate getExpiry() {
			return expiry;
		}
		public void setExpiry(LocalDate expiry) {
			this.expiry = expiry;
		}
		
		
		public Item(Long id, String itemName, double price, LocalDate manufacturingDate, LocalDate expiry) {
			super();
			this.id = id;
			this.itemName = itemName;
			this.price = price;
			this.manufacturingDate = manufacturingDate;
			this.expiry = expiry;
		}
		
		public Item() {
			super();
		}
		@Override
		public String toString() {
			return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", manufacturingDate="
					+ manufacturingDate + ", expiry=" + expiry + "]";
		}
		
		
		
		
		
}
