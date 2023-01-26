package com.jspiders.designpatterntask2.Laptop;

public class Laptop {
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
	public Laptop(String brand, double displaySize, int ram, String storageType, int storageSize, int graphicCard,
			int displayResolution, double price, int warranty, int discount) {
		super();
		this.brand = brand;
		this.displaySize = displaySize;
		this.ram = ram;
		this.storageType = storageType;
		this.storageSize = storageSize;
		this.graphicCard = graphicCard;
		this.displayResolution = displayResolution;
		this.price = price;
		this.warranty = warranty;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", displaySize=" + displaySize + ", ram=" + ram + ", storageType="
				+ storageType + ", storageSize=" + storageSize + ", graphicCard=" + graphicCard + ", displayResolution="
				+ displayResolution + ", price=" + price + ", warranty=" + warranty + ", discount=" + discount + "]";
	}
	 
	 
	 

}
