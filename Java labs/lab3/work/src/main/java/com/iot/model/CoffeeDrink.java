package com.iot.model;

import model.enums.CoffeePackType;
import model.enums.DrinkSortType;
import model.enums.DrinkType;

public class CoffeeDrink extends Drink {
    private CoffeePackType packageType;
    private int coffeeAmount;

    public CoffeeDrink() {
    }


    public CoffeeDrink(String pName, int pCapacity, int pPrice, DrinkSortType pSort, int pMilkAmount,
                       DrinkType pDrinkType, Integer pId, CoffeePackType packageType, int coffeeAmount) {
        super(pName, pCapacity, pPrice, pSort, pMilkAmount, pDrinkType, pId);
        this.packageType = packageType;
        this.coffeeAmount = coffeeAmount;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", packageType, coffeeAmount";
    }

    public final String toCSV() {
        return super.toCSV() + ", " + getPackageType() + ", " + getCoffeeAmount();
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
