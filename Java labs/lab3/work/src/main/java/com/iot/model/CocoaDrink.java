/**
 *
 */
package com.iot.model;

import model.enums.DrinkSortType;
import model.enums.DrinkType;

/**
 * @author khadai
 */
public class CocoaDrink extends Drink {
    private boolean doubleChocolate;

    public CocoaDrink(final String name, final int capacity, final int price, final DrinkSortType sort,
                      final int milkAmount, final DrinkType drinkType, final boolean pDoubleChocolate) {
        super(name, capacity, price, sort, milkAmount, drinkType);
        this.doubleChocolate = pDoubleChocolate;
    }

    public final boolean isDoubleChocolate() {
        return doubleChocolate;
    }

    @Override
    public final String toString() {
        String info = "cocoa: " + getName() + ", ";
        info += getCapacity() + "ml, ";
        info += getPrice() + "$ ";
        if (isDoubleChocolate()) {
            info += ", chocolate x2";
        }
        if (getMilkAmount() > 0) {
            info += ", milk: " + getMilkAmount() + "ml ";
        }
        info += ", coffee: 0ml ";
        return info;
    }
    public final String getHeaders() {
        return super.getHeaders()+", doubleChocolate";
    }
    public final String toCSV() {
        return super.toCSV()+", "+isDoubleChocolate();
    }

}
