package manager;

import com.iot.model.CocoaDrink;
import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;
import model.enums.DrinkType;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuManager {
    //private List<Drink> availableDrinks = new LinkedList<>();
    private Map<Integer, Drink> availableDrinks = new HashMap<>();

    public Map<Integer, Drink> getDrinks() {
        return availableDrinks;
    }

    public void setDrinks(Map<Integer, Drink> drinks) {
        this.availableDrinks = drinks;
    }

    public final void printMenu() {
        for (Map.Entry<Integer, Drink> coffee : availableDrinks.entrySet()) {
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

    public MenuManager(Map<Integer, Drink> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

    public void addDrink(Drink drink) {
        availableDrinks.put(drink.getId(), drink);
    }

    public final void sortByCoffeeAmount(final List<CoffeeDrink> coffees) {
        coffees.sort(Comparator.comparingInt(CoffeeDrink::getCoffeeAmount));
    }

    public final Map<Integer, Drink> findBySortOfDrink(final String type) {
        Map<Integer, Drink> map = new HashMap<>();
        for (Map.Entry<Integer, Drink> drink : availableDrinks.entrySet()) {
            if (type.equalsIgnoreCase(drink.getValue().getSort().toString())) {
                map.put(drink.getValue().getId(), drink.getValue());
            }
        }
        return map;
    }

    public final Map<Integer, CoffeeDrink> findByPackOfDrink(final String type) {
        Map<Integer, CoffeeDrink> coffeeList = new HashMap<>();
        for (Map.Entry<Integer, CoffeeDrink> drink : findCoffees().entrySet()) {
            if (type.equalsIgnoreCase(drink.getValue().getPackageType().toString())) {
                coffeeList.put(drink.getValue().getId(), drink.getValue());
            }
        }
        return coffeeList;
    }

    public final Map<Integer, CoffeeDrink> findCoffees() {
        Map<Integer, CoffeeDrink> coffeeList = new HashMap<>();
        for (Map.Entry<Integer, Drink> drink : availableDrinks.entrySet()) {
            if (drink.getValue().getDrinkType().equals(DrinkType.COFFEE)) {
                coffeeList.put(drink.getValue().getId(), (CoffeeDrink) drink.getValue());
            }
        }
        if (coffeeList.size() > 1) {
            return coffeeList;
        } else {
            System.out.println("There is no coffee in the menu!");
            return null;
        }
    }

    public final Map<Integer, Tea> findTeas() {
        Map<Integer, Tea> teaList = new HashMap<>();
        for (Map.Entry<Integer, Drink> drink : availableDrinks.entrySet()) {
            if (drink.getValue().getDrinkType().equals(DrinkType.TEA)) {
                teaList.put(drink.getValue().getId(), (Tea) drink.getValue());
            }
        }
        if (teaList.size() > 1) {
            return teaList;
        } else {
            System.out.println("There is no tea in the menu!");
            return null;
        }
    }

    public final Map<Integer, CocoaDrink> findCocoas() {
        Map<Integer, CocoaDrink> cocoaList = new HashMap<>();
        for (Map.Entry<Integer, Drink> drink : availableDrinks.entrySet()) {
            if (drink.getValue().getDrinkType().equals(DrinkType.COCOA)) {
                cocoaList.put(drink.getValue().getId(), (CocoaDrink) drink.getValue());
            }
        }
        if (cocoaList.size() >= 1) {
            return cocoaList;
        } else {
            System.out.println("There is no cocoa in the menu!");
            return null;
        }
    }

    public void setAvailableDrinks(Map<Integer, Drink> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

}
