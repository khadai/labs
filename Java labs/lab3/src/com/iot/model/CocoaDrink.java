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
public class CocoaDrink extends Drink {
	private boolean doubleChocolate;

	public CocoaDrink() {
	}

	public CocoaDrink(String name, int capacity, int price, SortsOfDrinks_Enum sort, Topping_Enum topping,
			int milkAmount, int quantity, boolean doubleChocolate) {
		super(name, capacity, price, sort, topping, milkAmount, quantity);
		this.doubleChocolate = doubleChocolate;
	}

	public CocoaDrink(String name, int capacity, int price, SortsOfDrinks_Enum sort, int milkAmount, int quantity,
			boolean doubleChocolate) {
		super(name, capacity, price, sort, milkAmount, quantity);
		this.doubleChocolate = doubleChocolate;
	}

	public boolean isDoubleChocolate() {
		return doubleChocolate;
	}

	public void setDoubleChocolate(boolean doubleChocolate) {
		this.doubleChocolate = doubleChocolate;
	}
	
	
	
}
