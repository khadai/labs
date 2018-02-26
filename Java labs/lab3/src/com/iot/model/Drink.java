package com.iot.model;

import model.enums.DrinkType;
import model.enums.DrinkSortType;

public class Drink {

	private String name = "Water";
	private int capacity = 250;
	private int price;
	private int milkAmount;
	private DrinkSortType sort = DrinkSortType.OTHER;
	private DrinkType drinkType = DrinkType.WATER;

	public Drink() {
	}

	public Drink(String name, int capacity, int price, DrinkSortType sort, int milkAmount, DrinkType drinkType) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.sort = sort;
		this.milkAmount = milkAmount;
		this.drinkType = drinkType;
	}

	@Override
	public String toString() {
		String info = "other: " + getName() + ", ";
		info += getCapacity() + "ml, ";
		info += getPrice() + "$";
		if (getMilkAmount() > 0) {
			info += ", milk: " + getMilkAmount() + "ml ";
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

	public DrinkType getDrinkType() {
		return drinkType;
	}

	public DrinkSortType getSort() {
		return sort;
	}

	public void setSort(DrinkSortType sort) {
		this.sort = sort;
	}

}
