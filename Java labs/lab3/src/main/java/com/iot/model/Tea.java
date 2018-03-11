/**
 *
 */
package com.iot.model;

import model.enums.DrinkSortType;
import model.enums.DrinkType;

/**
 * @author khadai
 */
public class Tea extends Drink {

    private int cupsAmount = 1;

    public Tea() {
    }

    public Tea(final String name, final int capacity, final int price, final DrinkSortType sort, final int milkAmount,
               final DrinkType drinkType, final int pCupsAmount) {
        super(name, capacity, price, sort, milkAmount, drinkType);
        this.cupsAmount = pCupsAmount;
    }

    public final int getCupsAmount() {
        return cupsAmount;
    }

    //@Override
    public final String toString() {
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
