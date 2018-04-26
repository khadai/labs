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

    public Tea(String pName, int pCapacity, int pPrice, DrinkSortType pSort, int pMilkAmount, DrinkType pDrinkType,
               Integer pId, int cupsAmount) {
        super(pName, pCapacity, pPrice, pSort, pMilkAmount, pDrinkType, pId);
        this.cupsAmount = cupsAmount;
    }

    public final int getCupsAmount() {
        return cupsAmount;
    }

    public final String getHeaders() {
        return super.getHeaders() + ", cupsAmount";
    }

    public final String toCSV() {
        return super.toCSV() + ", " + getCupsAmount() + ", " + getCupsAmount();
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
