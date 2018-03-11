package manager;

import com.iot.model.CocoaDrink;
import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;
import model.enums.DrinkType;

import java.util.LinkedList;
import java.util.List;

public class MenuManager {
    private List<Drink> availableDrinks = new LinkedList<>();

    public final void printMenu() {
        for (Drink coffee : availableDrinks) {
            System.out.println(coffee);
        }
    }

    public final void print(final List<Drink> drinks) {
        for (Drink coffee : drinks) {
            System.out.println(coffee);
        }
    }

    public MenuManager() {
    }

    public MenuManager(final List<Drink> newAvailableDrinks) {
        this.availableDrinks = newAvailableDrinks;
    }

    public final void sortByCoffeeAmount(final List<CoffeeDrink> coffees) {
        coffees.sort((CoffeeDrink o1, CoffeeDrink o2) -> o1.getCoffeeAmount() - o2.getCoffeeAmount());
    }

    public final List<Drink> findBySortOfDrink(final String type) {
        List<Drink> coffeeList = new LinkedList<Drink>();
        for (Drink drink : availableDrinks) {
            if (type.equalsIgnoreCase(drink.getSort().toString())) {
                coffeeList.add(drink);
            }
        }
        return coffeeList;
    }

    public final List<CoffeeDrink> findByPackOfDrink(final String type) {
        List<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
        for (CoffeeDrink drink : findCoffees()) {
            if (type.equalsIgnoreCase(drink.getPackageType().toString())) {
                coffeeList.add(drink);
            }
        }
        return coffeeList;
    }

    public final List<CoffeeDrink> findCoffees() {
        List<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
        for (Drink drink : availableDrinks) {
            if (drink.getDrinkType().equals(DrinkType.COFFEE)) {
                coffeeList.add((CoffeeDrink) drink);
            }
        }
        if (coffeeList.size() > 1) {
            return coffeeList;
        } else {
            System.out.println("There is no coffee in the menu!");
            return null;
        }
    }

    public final List<Tea> findTeas() {
        List<Tea> teaList = new LinkedList<Tea>();
        for (Drink drink : availableDrinks) {
            if (drink.getDrinkType().equals(DrinkType.TEA)) {
                teaList.add((Tea) drink);
            }
        }
        if (teaList.size() > 1) {
            return teaList;
        } else {
            System.out.println("There is no tea in the menu!");
            return null;
        }
    }

    public final List<CocoaDrink> findCocoas() {
        List<CocoaDrink> cocoaList = new LinkedList<CocoaDrink>();
        for (Drink drink : availableDrinks) {
            if (drink.getDrinkType().equals(DrinkType.COCOA)) {
                cocoaList.add((CocoaDrink) drink);
            }
        }
        if (cocoaList.size() >= 1) {
            return cocoaList;
        } else {
            System.out.println("There is no cocoa in the menu!");
            return null;
        }
    }

    public final List<Drink> getAvailableDrinks() {
        return availableDrinks;
    }

}
