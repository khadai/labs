package com.iot.model;

import model.enums.SortsOfDrinks_Enum;

public class Drink {
	
	private String name = "Water";
	private int capacity = 250;
	private int price;
	private int milkAmount;
	public SortsOfDrinks_Enum sort = SortsOfDrinks_Enum.other;
	

	public Drink(){
	}
	
	public Drink(String name, int capacity, int price, SortsOfDrinks_Enum sort, int milkAmount) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.sort=sort;
		this.milkAmount = milkAmount;
	}
	
	@Override
	public String toString() {
		String info = "other: " + getName()+", ";
		info+=getCapacity()+"ml, ";
		info+=getPrice()+"$";
		if(getMilkAmount() > 0) {
			info+= ", milk: "+getMilkAmount()+"ml ";
			}
		return info;
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


	public SortsOfDrinks_Enum getSort() {
		return sort;
	}

	public void setSort(SortsOfDrinks_Enum sort) {
		this.sort = sort;
	}

	
}
