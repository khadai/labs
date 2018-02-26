/**
 * 
 */
package com.iot.model;

import model.enums.DrinkType;
import model.enums.DrinkSortType;

/**
 * @author khadai
 *
 */
public class Tea extends Drink {

	private int cupsAmount = 1;

	public Tea() {
	}

	public Tea(String name, int capacity, int price, DrinkSortType sort, int milkAmount, DrinkType drinkType,
			int cupsAmount) {
		super(name, capacity, price, sort, milkAmount, drinkType);
		this.cupsAmount = cupsAmount;
	}

	public int getCupsAmount() {
		return cupsAmount;
	}

	public void setCupsAmount(int cupsAmount) {
		this.cupsAmount = cupsAmount;
	}

	@Override
	public String toString() {
		String info = "tea: " + getName() + ", ";
		info += getCapacity() + "ml, ";
		info += getPrice() + "$, ";
		info += getCupsAmount() + " cups";
		info += ", coffee: 0";
		if (getMilkAmount() > 0) {
			info += ", milk amount: " + getMilkAmount() + "ml ";
		}
		return info;
	}

}
