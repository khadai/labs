package com.iot.model;

import model.enums.DrinkSortType;
import model.enums.DrinkType;

@javax.persistence.Entity
public class Drink {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    @javax.persistence.Column(name = "drink_id")
    private Integer id;

    private static final String COMMA_DELIMITER = ",";
    @javax.persistence.Column(name = "drink_name")
    private String name = "Water";
    @javax.persistence.Column(name = "drink_capacity")
    private int capacity = 250;
    @javax.persistence.Column(name = "drink_price")
    private int price;
    @javax.persistence.Column(name = "drink_milk_amount")
    private int milkAmount;
    @javax.persistence.Column(name = "drink_sort")
    private DrinkSortType sort = DrinkSortType.OTHER;
    @javax.persistence.Column(name = "drink_type")
    private DrinkType drinkType = DrinkType.WATER;

    public Drink() {
    }

    public Drink(int id) {
        this.id = id;
    }

    public Drink(final String pName, final int pCapacity, final int pPrice, final DrinkSortType pSort,
                 final int pMilkAmount, final DrinkType pDrinkType, final Integer pId) {
        this.name = pName;
        this.capacity = pCapacity;
        this.price = pPrice;
        this.sort = pSort;
        this.milkAmount = pMilkAmount;
        this.drinkType = pDrinkType;
        this.id = pId;
    }

    public Drink(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public static String getCommaDelimiter() {
        return COMMA_DELIMITER;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public final int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public final int getMilkAmount() {
        return milkAmount;
    }

    public void setMilkAmount(int milkAmount) {
        this.milkAmount = milkAmount;
    }

    public final DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public final DrinkSortType getSort() {
        return sort;
    }

    public void setSort(DrinkSortType sort) {
        this.sort = sort;
    }

}
