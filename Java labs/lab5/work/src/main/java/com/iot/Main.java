package com.iot;

import java.util.List;

import com.iot.model.CocoaDrink;
import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;

import manager.MenuManager;
import model.enums.CoffeePackType;
import model.enums.DrinkSortType;
import model.enums.DrinkType;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CoffeeDrink espresso = new CoffeeDrink("Espresso", 50, 12, DrinkSortType.INSTANT, 0, DrinkType.COFFEE,
				CoffeePackType.JAR, 50);
		CoffeeDrink nescafe = new CoffeeDrink("Nescafe", 250, 5, DrinkSortType.INSTANT, 0, DrinkType.COFFEE,
				CoffeePackType.PACK, 150);
		CoffeeDrink cappuchino = new CoffeeDrink("Cappuchino", 250, 15, DrinkSortType.INSTANT, 150, DrinkType.COFFEE,
				CoffeePackType.JAR, 100);
		CocoaDrink hotMilkChocolate = new CocoaDrink("Hot Milk Chocolate", 150, 16, DrinkSortType.OTHER, 110,
				DrinkType.COCOA, true);
		CoffeeDrink americano = new CoffeeDrink("Americano", 150, 16, DrinkSortType.CEREAL, 40, DrinkType.COFFEE,
				CoffeePackType.PACK, 110);
		CoffeeDrink groundedCoffee = new CoffeeDrink("Grounded coffee", 250, 46, DrinkSortType.GROUNDED, 0,
				DrinkType.COFFEE, CoffeePackType.PACK, 250);

		Tea greenTea = new Tea("Green royal tea", 450, 54, DrinkSortType.GREEN, 0, DrinkType.TEA, 2);
		Tea blackTea = new Tea("Obama`s local tea", 950, 94, DrinkSortType.BLACK, 0, DrinkType.TEA, 6);
		Tea fruitTea = new Tea("Dracon`s fruit tea", 450, 74, DrinkSortType.FRUIT, 0, DrinkType.TEA, 3);

		Drink water = new Drink();

		MenuManager coffeeMine = new MenuManager();

		coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
		coffeeMine.getAvailableDrinks().add(espresso);
		coffeeMine.getAvailableDrinks().add(americano);
		coffeeMine.getAvailableDrinks().add(nescafe);
		coffeeMine.getAvailableDrinks().add(cappuchino);
		coffeeMine.getAvailableDrinks().add(greenTea);
		coffeeMine.getAvailableDrinks().add(blackTea);
		coffeeMine.getAvailableDrinks().add(fruitTea);
		coffeeMine.getAvailableDrinks().add(groundedCoffee);
		coffeeMine.getAvailableDrinks().add(water);

		System.out.println("Menu");
		System.out.println(" 1 - Print menu of drinks;");
		System.out.println(" 2 - Search by type of drink;");
		System.out.println(" 3 - Print list of available coffees;");
		System.out.println(" 4 - Print list of available teas;");
		System.out.println(" 5 - Print list of available cocoas;");
		System.out.println(" 6 - Print list of coffee, sorted by coffee amount;");
		System.out.println(" 7 - Search by type of pack;");
		System.out.println(" 8 - Exit;");

		boolean justBooleanVariable = true;

		do {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			switch (num) {
			case 1: {
				coffeeMine.printMenu();
				break;
			}
			case 2: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the type: ");
				String type = scanner.nextLine();
				List<Drink> drinks = coffeeMine.findBySortOfDrink(type);
				coffeeMine.print(drinks);
				break;
			}
			case 3: {
				for (CoffeeDrink coffee : coffeeMine.findCoffees()) {
					System.out.println(coffee);
				}
				break;
			}
			case 4: {
				for (Tea tea : coffeeMine.findTeas()) {
					System.out.println(tea);
				}
				break;
			}
			case 5: {
				for (CocoaDrink cocoa : coffeeMine.findCocoas()) {
					System.out.println(cocoa);
				}
				break;
			}
			case 6: {
				List<CoffeeDrink> coffees = coffeeMine.findCoffees();
				coffeeMine.sortByCoffeeAmount(coffees);
				for (CoffeeDrink coffee : coffees) {
					System.out.println(coffee);
				}
				break;
			}
			case 7: {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the pack to find:  ");
				String type = scanner.nextLine();
				List<CoffeeDrink> drinksWithPack = coffeeMine.findByPackOfDrink(type);
				for (CoffeeDrink coffee : drinksWithPack) {
					System.out.println(coffee);
				}
				break;
			}
			case 8:
			default: {
				System.out.println("Exited programm");
				justBooleanVariable = false;
				break;
			}

			}
		} while (justBooleanVariable);
	}
}