package com.iot.model;

import model.enums.PackOfCoffee_Enum;
import model.enums.SortsOfDrinks_Enum;

public class CoffeeDrink extends Drink implements Comparable<CoffeeDrink>{
	
	private PackOfCoffee_Enum packageType;
	private int coffeeAmount;
	
	public CoffeeDrink() {
	}

	public CoffeeDrink(String name, int capacity, int price, SortsOfDrinks_Enum sort,
			int milkAmount, PackOfCoffee_Enum packageType, int coffeeAmount) {
		super(name, capacity, price, sort,  milkAmount);
		this.packageType = packageType;
		this.coffeeAmount = coffeeAmount;
	}

	public int getCoffeeAmount() {
		return coffeeAmount;
	}

	public void setCoffeeAmount(int coffeeAmount) {
		this.coffeeAmount = coffeeAmount;
	}

	public PackOfCoffee_Enum getPackageType() {
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
