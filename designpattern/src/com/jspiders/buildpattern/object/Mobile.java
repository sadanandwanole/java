package com.jspiders.buildpattern.object;

public class Mobile {
	private String brand;
	private String model;
	private int ram;
	private int memory;
	private int front_cam;
	private int rear_cam;
	private double price;
	private int battery;
	private String color;
	private double processor;
	public Mobile(String brand, String model, int ram, int memory, int front_cam, int rear_cam, double price,
			int battery, String color, double processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.memory = memory;
		this.front_cam = front_cam;
		this.rear_cam = rear_cam;
		this.price = price;
		this.battery = battery;
		this.color = color;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "=========================Mobile ===============================\n"
				+ "brand :" + this.brand +"\n"
				+ " model: " + this.model +"\n "
				+"ram :" +this.ram +"\n "
				+"memory :" + this.memory + "\n"
				+"front_cam :"+ this.front_cam +"\n"
				+ " rear_cam :" + this.rear_cam +"\n "
				+ " price :" + this.price +"\n "
				+ "battery :" + this.battery + "\n"
				+ " color :"+ this.color + "\n"
				+ " processor=" + this.processor ;
	}
	
	
	

}
