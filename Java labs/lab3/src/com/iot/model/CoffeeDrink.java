package com.iot.model;

import model.enums.CoffeePackType;
import model.enums.DrinkSortType;
import model.enums.DrinkType;

public class CoffeeDrink extends Drink implements Comparable<CoffeeDrink>{
	
	private CoffeePackType packageType;
	private int coffeeAmount;
	
	public CoffeeDrink() {
	}

	public CoffeeDrink(String name, int capacity, int price, DrinkSortType sort, int milkAmount, DrinkType drinkType,
			CoffeePackType packageType, int coffeeAmount) {
		super(name, capacity, price, sort, milkAmount, drinkType);
		this.packageType = packageType;
		this.coffeeAmount = coffeeAmount;
	}

	public int getCoffeeAmount() {
		return coffeeAmount;
	}

	public void setCoffeeAmount(int coffeeAmount) {
		this.coffeeAmount = coffeeAmount;
	}

	public CoffeePackType getPackageType() {
		return packageType;
	}


	@Override
	public String toString() {
		String info = "coffee: " + getName()+", ";
		info+=getCapacity()+"ml, ";
		info+=getPrice()+"$ ";
		info+=","+getPackageType();
		if(getMilkAmount() > 0) {
		info+= ", milk: "+getMilkAmount()+"ml ";
		}
		info+= ", coffee: "+getCoffeeAmount()+"ml ";
		return info;
	}
	
	
	@Override
	public int compareTo(CoffeeDrink arg0) {
		return 0;
	}

}
