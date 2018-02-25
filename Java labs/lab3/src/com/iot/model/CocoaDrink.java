/**
 * 
 */
package com.iot.model;

import model.enums.SortsOfDrinks_Enum;

/**
 * @author khadai
 *
 */
public class CocoaDrink extends Drink {
	private boolean doubleChocolate;

	public CocoaDrink() {
	}

	public CocoaDrink(String name, int capacity, int price, SortsOfDrinks_Enum sort, 
			int milkAmount, boolean doubleChocolate) {
		super(name, capacity, price, sort,  milkAmount);
		this.doubleChocolate = doubleChocolate;
	}

	public boolean isDoubleChocolate() {
		return doubleChocolate;
	}

	public void setDoubleChocolate(boolean doubleChocolate) {
		this.doubleChocolate = doubleChocolate;
	}
	
	@Override
	public String toString() {
		String info = "cocoa: " + getName()+", ";
		info+=getCapacity()+"ml, ";
		info+=getPrice()+"$ ";
		if(isDoubleChocolate()) {
			info+= ", chocolate x2";
		}
		if(getMilkAmount() > 0) {
		info+= ", milk: "+getMilkAmount()+"ml ";
		}
		info+= ", coffee: 0ml ";
		return info;
	}
	
	
	
}
