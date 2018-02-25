package manager;

import java.util.LinkedList;
import java.util.List;

import com.iot.model.CocoaDrink;
import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;

//import model.enums.PackOfCoffee_Enum;
import model.enums.SortsOfDrinks_Enum;

public class MenuManager {
	private  LinkedList<Drink> availableDrinks = new LinkedList<Drink>();

	
	public  void printMenu() {
		for (Drink coffee : availableDrinks) {
			System.out.println(coffee);
		}
	}
	
	public  void print(LinkedList<Drink> drinks) {
		for ( Drink coffee : drinks) {
			System.out.println(coffee);
		}
	}
	
	
	public MenuManager() {}
	
	public MenuManager(LinkedList<Drink> availableDrinks) {
		this.availableDrinks = availableDrinks;
	}

	public  void sortByCoffeeAmount(LinkedList<CoffeeDrink> list) {
		list.sort((CoffeeDrink o1, CoffeeDrink o2)->o1.getCoffeeAmount()-o2.getCoffeeAmount());
	} 
	
	public  LinkedList<Drink> findBySortOfDrink(String type) {
		LinkedList<Drink> coffeeList = new LinkedList<Drink>();
		for (Drink drink : availableDrinks) {
			if(type.equalsIgnoreCase(drink.getSort().toString())) {
				coffeeList.add(drink);
			}
		}
		return coffeeList;
	}
	
	public  LinkedList<CoffeeDrink> findByPackOfDrink(String type) {
		LinkedList<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
		for (CoffeeDrink drink : findCoffees()) {
			if(type.equalsIgnoreCase(drink.getPackageType().toString())) {
				coffeeList.add(drink);
			}
		}
		return coffeeList;
	}
	
	public  LinkedList<CoffeeDrink> findCoffees() {
		LinkedList<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
		for (Drink drink : availableDrinks) {
			if(drink.getClass().getSimpleName().equals("CoffeeDrink")) {
				coffeeList.add((CoffeeDrink) drink);
				}
			}
		if (coffeeList.size()>1) {
		return coffeeList;
		}
		else {
			System.out.println("There is no coffee in the menu!");
			return null;
		}
	}
	
	public  LinkedList<Tea> findTeas() {
		LinkedList<Tea> teaList = new LinkedList<Tea>();
		for (Drink drink : availableDrinks) {
			if(drink.getClass().getSimpleName().equals("Tea")) {
				teaList.add((Tea) drink);
				}
			}
		if (teaList.size()>1) {
		return teaList;
		}
		else {
			System.out.println("There is no tea in the menu!");
			return null;
		}
	}
	
	public  LinkedList<CocoaDrink> findCocoas() {
		LinkedList<CocoaDrink> cocoaList = new LinkedList<CocoaDrink>();
		for (Drink drink : availableDrinks) {
			if(drink.getClass().getSimpleName().equals("CocoaDrink")) {
				cocoaList.add( (CocoaDrink) drink);
				}
			}
		if (cocoaList.size()>=1) {
		return cocoaList;
		}
		else {
			System.out.println("There is no cocoa in the menu!");
			return null;
		}
	}
	
	public  LinkedList<Drink> getAvailableDrinks() {
		return availableDrinks;
	}

	public  void setAvailableDrinks(LinkedList<Drink> availableDrinks) {
		this.availableDrinks = availableDrinks;
	}

	
	
}
