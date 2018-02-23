package manager;

import java.util.LinkedList;
import java.util.List;

import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;

//import model.enums.PackOfCoffee_Enum;
import model.enums.SortsOfDrinks_Enum;

public class MenuManager {
	public static LinkedList<Drink> availableDrinks = new LinkedList<Drink>();

	public static void printMenu() {
		for (Drink coffee : MenuManager.availableDrinks) {
			System.out.println(coffee);
		}
	}
	
	public static void sortByCoffeeAmount(LinkedList<CoffeeDrink> list) {
		list.sort((CoffeeDrink o1, CoffeeDrink o2)->o1.getCoffeeAmount()-o2.getCoffeeAmount());
	} 
	
	public static List<CoffeeDrink> findBySortOfCoffee(SortsOfDrinks_Enum sortToFind) {
		LinkedList<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
		
		for (Drink drink : MenuManager.availableDrinks) {
			if(sortToFind == drink.sort) {
				coffeeList.add((CoffeeDrink) drink);
				System.out.println(drink);
			}
			//else return null;
		}
		return coffeeList;
	}
	
	public static <availableDrinks> LinkedList<Drink> getAvailableDrinks() {
		return availableDrinks;
	}

	public static void setAvailableDrinks(LinkedList<Drink> availableDrinks) {
		MenuManager.availableDrinks = availableDrinks;
	}
	
	
	
}
