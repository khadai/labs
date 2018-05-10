package manager;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import com.iot.model.CocoaDrink;
import com.iot.model.CoffeeDrink;
import com.iot.model.Drink;
import com.iot.model.Tea;

import model.enums.DrinkType;
import persistence.dao.DrinkDao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class MenuManager implements Serializable {
    @Inject
    private DrinkDao dao;
    private List<Drink> availableDrinks = new LinkedList<Drink>();

    public void printMenu() {
        for (Drink coffee : availableDrinks) {
            System.out.println(coffee);
        }
    }

    public void print(List<Drink> drinks) {
        for (Drink coffee : drinks) {
            System.out.println(coffee);
        }
    }

    public MenuManager() {
    }

    public MenuManager(List<Drink> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

    public void sortByCoffeeAmount(List<CoffeeDrink> coffees) {
        coffees.sort((CoffeeDrink o1, CoffeeDrink o2) -> o1.getCoffeeAmount() - o2.getCoffeeAmount());
    }

    public List<Drink> findBySortOfDrink(String type) {
        List<Drink> coffeeList = new LinkedList<Drink>();
        for (Drink drink : availableDrinks) {
            if (type.equalsIgnoreCase(drink.getSort().toString())) {
                coffeeList.add(drink);
            }
        }
        return coffeeList;
    }

    public List<CoffeeDrink> findByPackOfDrink(String type) {
        List<CoffeeDrink> coffeeList = new LinkedList<CoffeeDrink>();
        for (CoffeeDrink drink : findCoffees()) {
            if (type.equalsIgnoreCase(drink.getPackageType().toString())) {
                coffeeList.add(drink);
            }
        }
        return coffeeList;
    }

    public List<CoffeeDrink> findCoffees() {
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

    public List<Tea> findTeas() {
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

    public List<CocoaDrink> findCocoas() {
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

    public List<Drink> getAvailableDrinks() {
        return availableDrinks;
    }

    public void setAvailableDrinks(LinkedList<Drink> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

    public Drink get( Integer id) {
        return dao.findById(id);
    }

    public Drink put(Drink drink) {
        return dao.persist(drink);
    }

    public void remove(Drink drink) {
        dao.delete(drink.getId());
    }

    public Drink update(Drink drink) {
        return dao.update(drink);
    }

}