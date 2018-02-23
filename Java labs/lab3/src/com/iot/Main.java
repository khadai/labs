package com.iot;

import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;

import manager.MenuManager;
import model.enums.PackOfCoffee_Enum;
import model.enums.SortsOfDrinks_Enum;


public class Main {

	public static void main(String[] args) {
		
		CoffeeDrink espresso = new CoffeeDrink("Espresso", 50, 12, 0, 1, PackOfCoffee_Enum.JAR, 50, SortsOfDrinks_Enum.INSTANT);
		CoffeeDrink nescafe = new CoffeeDrink("Nescafe", 250, 5, 0, 1, PackOfCoffee_Enum.JAR, 50, SortsOfDrinks_Enum.INSTANT);

		CoffeeDrink americano = new CoffeeDrink("Americano", 150, 15, 50, 1, PackOfCoffee_Enum.JAR, 100, SortsOfDrinks_Enum.CEREAL);
		Tea greenTea = new Tea();
		
		MenuManager.availableDrinks.add(greenTea);
		MenuManager.availableDrinks.add(espresso);
		MenuManager.availableDrinks.add(americano);
		MenuManager.availableDrinks.add(nescafe);
		
		System.out.println("Before Sort:");
		MenuManager.printMenu();
		
		System.out.println("After Sort:");
		
	    MenuManager.availableDrinks.sort((Drink o1, Drink o2)->o1.getPrice()-o2.getPrice());
		MenuManager.printMenu();
		System.out.println(" ");

		
		MenuManager.findBySortOfCoffee(SortsOfDrinks_Enum.INSTANT);


		}

}
