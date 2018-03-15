package com.iot.model;

import model.enums.DrinkSortType;
import model.enums.DrinkType;

public class Drink {

    private String name = "Water";
    private int capacity = 250;
    private int price;
    private int milkAmount;
    private DrinkSortType sort = DrinkSortType.OTHER;
    private DrinkType drinkType = DrinkType.WATER;

    public Drink() {
    }

    public Drink(final String pName, final int pCapacity, final int pPrice, final DrinkSortType pSort,
                 final int pMilkAmount, final DrinkType pDrinkType) {
        super();
        this.name = pName;
        this.capacity = pCapacity;
        this.price = pPrice;
        this.sort = pSort;
        this.milkAmount = pMilkAmount;
        this.drinkType = pDrinkType;
    }

    @Override
    public String toString() {
        String info = "other: " + getName() + ", ";
        info += getCapacity() + "ml, ";
        info += getPrice() + "$";
        if (getMilkAmount() > 0) {
            info += ", milk: " + getMilkAmount() + "ml ";
        }
        return info;
    }

    public String getHeaders() {
        return "name, capacity, price, milkAmount, sort, drinkType";
    }

    public String toCSV() {
        return getName() + ", " + getCapacity() + ", " + getPrice() + ", " + getMilkAmount() + ", " + getSort() + ", "
                + getDrinkType();
    }


    public final String getName() {
        return name;
    }

    public final void setName(final String pName) {
        this.name = pName;
    }

    public final int getCapacity() {
        return capacity;
    }

    public final int getPrice() {
        return price;
    }

    public final int getMilkAmount() {
        return milkAmount;
    }

    public final DrinkType getDrinkType() {
        return drinkType;
    }

    public final DrinkSortType getSort() {
        return sort;
    }

}
