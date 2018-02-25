/**
 * 
 */
package com.iot.model;

import model.enums.SortsOfDrinks_Enum;

/**
 * @author khadai
 *
 */
public class Tea extends Drink {

	private int cupsAmount = 1;
	private SortsOfDrinks_Enum typeOfTea;
	
	public Tea() {
	}

	public Tea(String name, int capacity, int price, SortsOfDrinks_Enum sort, int milkAmount,
			 int cupsAmount) {
		super(name, capacity, price, sort,  milkAmount);
		this.cupsAmount = cupsAmount;
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
		String info = "tea: " + getName()+", ";
		info+=getCapacity()+"ml, ";
		info+=getPrice()+"$, ";
		info+=getCupsAmount()+" cups";
		info+= ", coffee: 0";
		if(getMilkAmount() > 0) {
		info+= ", milk amount: "+getMilkAmount()+"ml ";
		}
		return info;
	}
	
}
