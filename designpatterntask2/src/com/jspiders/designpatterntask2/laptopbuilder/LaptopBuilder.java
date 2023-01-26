package com.jspiders.designpatterntask2.laptopbuilder;

import com.jspiders.designpatterntask2.Laptop.Laptop;

public class LaptopBuilder {
	
	private String  brand; 
	private double displaySize;
	private int ram;
	private String storageType;
	private int storageSize; 
	private int graphicCard; 
	 private int displayResolution;
	 private double price; 
	 private int warranty; 
	 private int discount;
	
	public LaptopBuilder Brand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public LaptopBuilder DisplaySize(double displaySize) {
		this.displaySize = displaySize;
		return this;
	}
	
	public LaptopBuilder Ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public LaptopBuilder StorageType(String storageType) {
		this.storageType = storageType;
		return this;
	}
	
	public LaptopBuilder StorageSize(int storageSize) {
		this.storageSize = storageSize;
		return this;
	}
	
	public LaptopBuilder GraphicCard(int graphicCard) {
		this.graphicCard = graphicCard;
		return this;
	}
	
	public LaptopBuilder DisplayResolution(int displayResolution) {
		this.displayResolution = displayResolution;
		return this;
	}
	
	public LaptopBuilder Price(double price) {
		this.price = price;
		return this;
	}
	
	public LaptopBuilder Warranty(int warranty) {
		this.warranty = warranty;
		return this;
	}
	
	public LaptopBuilder Discount(int discount) {
		this.discount = discount;
		return this;
	}
	
	public Laptop getLaptop() {
		Laptop laptop =new Laptop(brand, displaySize, ram, storageType, storageSize, graphicCard, displayResolution, price, warranty, discount);
		return laptop;
		
	}
	 
	 

}
