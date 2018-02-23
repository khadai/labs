/**
 * 
 */
package com.iot.model;

import model.enums.SortsOfDrinks_Enum;
import model.enums.Topping_Enum;

/**
 * @author khadai
 *
 */
public class Tea extends Drink {

	private int cupsAmount;
	private SortsOfDrinks_Enum typeOfTea;
	
	public Tea() {
	}

	public Tea(String name, int capacity, int price, SortsOfDrinks_Enum sort, int milkAmount, int quantity,
			int cupsAmount, SortsOfDrinks_Enum typeOfTea) {
		super(name, capacity, price, sort, milkAmount, quantity);
		this.cupsAmount = cupsAmount;
		this.typeOfTea = typeOfTea;
	}

	public Tea(String name, int capacity, int price, SortsOfDrinks_Enum sort, Topping_Enum topping, int milkAmount,
			int quantity, int cupsAmount, SortsOfDrinks_Enum typeOfTea) {
		super(name, capacity, price, sort, topping, milkAmount, quantity);
		this.cupsAmount = cupsAmount;
		this.typeOfTea = typeOfTea;
	}



	public int getCupsAmount() {
		return cupsAmount;
	}

	public void setCupsAmount(int cupsAmount) {
		this.cupsAmount = cupsAmount;
	}

	public SortsOfDrinks_Enum getTypeOfTea() {
		return typeOfTea;
	}
	
	@Override
	public String toString() {
		String info = "name="+getName()+" capacity="+getCapacity()+" price="+getPrice();
		return info;
	}
	
}
