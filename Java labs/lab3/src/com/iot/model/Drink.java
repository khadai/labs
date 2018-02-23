package com.iot.model;

import model.enums.SortsOfDrinks_Enum;
import model.enums.Topping_Enum;

public class Drink {
	
	private String name = "Water";
	private int capacity;
	private int price;
	private Topping_Enum topping;
	private int milkAmount;
	private int quantity;
	public SortsOfDrinks_Enum sort;
	
	public Topping_Enum getTopping() {
		return topping;
	}

	public Drink(){
	}

	public Drink(String name, int capacity, int price, SortsOfDrinks_Enum sort,int milkAmount, int quantity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.sort=sort;
		this.milkAmount = milkAmount;
		this.quantity = quantity;
	}
	
	public Drink(String name, int capacity, int price, SortsOfDrinks_Enum sort,Topping_Enum topping, int milkAmount, int quantity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.topping = topping;
		this.sort=sort;
		this.milkAmount = milkAmount;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMilkAmount() {
		return milkAmount;
	}

	public void setMilkAmount(int milkAmount) {
		this.milkAmount = milkAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
