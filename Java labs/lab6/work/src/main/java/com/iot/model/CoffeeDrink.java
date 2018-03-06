package com.iot.model;

import model.enums.CoffeePackType;
import model.enums.DrinkSortType;
import model.enums.DrinkType;

public class CoffeeDrink extends Drink {
    private CoffeePackType packageType;
    private int coffeeAmount;

    public CoffeeDrink() {
    }

    public CoffeeDrink(final String name, final int capacity, final int price, final DrinkSortType sort,
                       final int milkAmount, final DrinkType drinkType, final CoffeePackType pPackageType,
                       final int pCoffeeAmount) {
        super(name, capacity, price, sort, milkAmount, drinkType);
        this.packageType = pPackageType;
        this.coffeeAmount = pCoffeeAmount;
    }

    public final int getCoffeeAmount() {
        return coffeeAmount;
    }

    public final CoffeePackType getPackageType() {
        return packageType;
    }

    //@Override
    public final String toString() {
        String info = "coffee: " + getName() + ", ";
        info += getCapacity() + "ml, ";
        info += getPrice() + "$ ";
        info += "," + getPackageType();
        if (getMilkAmount() > 0) {
            info += ", milk: " + getMilkAmount() + "ml ";
        }
        info += ", coffee: " + getCoffeeAmount() + "ml ";
        return info;
    }
}
