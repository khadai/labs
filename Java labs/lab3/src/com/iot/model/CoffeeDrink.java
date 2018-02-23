package com.iot.model;

import model.enums.PackOfCoffee_Enum;
import model.enums.SortsOfDrinks_Enum;
import model.enums.Topping_Enum;

public class CoffeeDrink extends Drink implements Comparable<CoffeeDrink>{
	
	private PackOfCoffee_Enum packageType;
	private int coffeeAmount;
	private SortsOfDrinks_Enum typeOfCoffee;
	
	public CoffeeDrink() {
	}

	public CoffeeDrink(String name, int capacity, int price, int milkAmount, int quantity, PackOfCoffee_Enum packageType,
			int coffeeAmount, SortsOfDrinks_Enum typeOfCoffee) {
		super(name, capacity, price, typeOfCoffee, milkAmount, quantity);
		this.packageType = packageType;
		this.coffeeAmount = coffeeAmount;
		this.typeOfCoffee = typeOfCoffee;
	}

	public CoffeeDrink(String name, int capacity, int price, SortsOfDrinks_Enum sort, Topping_Enum topping,
			int milkAmount, int quantity, PackOfCoffee_Enum packageType, int coffeeAmount,
			SortsOfDrinks_Enum typeOfCoffee) {
		super(name, capacity, price, sort, topping, milkAmount, quantity);
		this.packageType = packageType;
		this.coffeeAmount = coffeeAmount;
		this.typeOfCoffee = typeOfCoffee;
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

	public SortsOfDrinks_Enum getTypeOfCoffee() {
		return typeOfCoffee;
	}

	@Override
	public String toString() {
		String info = "name="+getName()+" capacity="+getCapacity()+" price="+getPrice();
		return info;
	}
	
	
	@Override
	public int compareTo(CoffeeDrink arg0) {
		return 0;
	}

}
