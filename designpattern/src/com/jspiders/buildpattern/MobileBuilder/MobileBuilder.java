package com.jspiders.buildpattern.MobileBuilder;

import com.jspiders.buildpattern.object.Mobile;

public class MobileBuilder {
	
	
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
	
	
	public MobileBuilder Brand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public MobileBuilder Model(String model) {
		this.model = model;
		return this;
	}
	
	public MobileBuilder Ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public MobileBuilder Memory(int memory) {
		this.memory = memory;
		return this;
	}
	
	public MobileBuilder Front_cam(int front_cam) {
		this.front_cam = front_cam;
		return this;
	}
	
	public MobileBuilder Rear_cam(int rear_cam) {
		this.rear_cam = rear_cam;
		return this;
	}
	
	public MobileBuilder Price(double price) {
		this.price = price;
		return this;
	}
	
	public MobileBuilder Battery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public MobileBuilder Color(String color) {
		this.color = color;
		return this;
	}
	
	public MobileBuilder Processor(double processor) {
		this.processor = processor;
		return this;
	}
	
	
		public Mobile getmobile() {
			Mobile mobile=new Mobile(brand, model, ram, memory, front_cam,
					rear_cam, price, battery, color, processor);
			return mobile;
		}
			
		}

