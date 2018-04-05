//package manager;
//
//import com.iot.model.CocoaDrink;
//import com.iot.model.CoffeeDrink;
//import com.iot.model.Drink;
//import com.iot.model.Tea;
//import model.enums.CoffeePackType;
//import model.enums.DrinkSortType;
//import model.enums.DrinkType;
//import org.junit.jupiter.api.Test;
//import writer.DrinkWriter;
//
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class MenuManagerTest {
//
//    private CoffeeDrink espresso = new CoffeeDrink("Espresso", 50, 12, DrinkSortType.INSTANT,
//            0, DrinkType.COFFEE, CoffeePackType.JAR, 50);
//    private CoffeeDrink nescafe = new CoffeeDrink("Nescafe", 250, 5, DrinkSortType.INSTANT,
//            0, DrinkType.COFFEE, CoffeePackType.PACK, 150);
//    private CoffeeDrink cappuchino = new CoffeeDrink("Cappuchino", 250, 15, DrinkSortType.INSTANT,
//            150, DrinkType.COFFEE, CoffeePackType.JAR, 100);
//    private CocoaDrink hotMilkChocolate = new CocoaDrink("Hot Milk Chocolate", 150, 16,
//            DrinkSortType.OTHER, 110, DrinkType.COCOA, true);
//    private CoffeeDrink americano = new CoffeeDrink("Americano", 150, 16, DrinkSortType.CEREAL,
//            40, DrinkType.COFFEE, CoffeePackType.PACK, 110);
//    private CoffeeDrink groundedCoffee = new CoffeeDrink("Grounded coffee", 250, 46,
//            DrinkSortType.GROUNDED, 0, DrinkType.COFFEE, CoffeePackType.PACK, 250);
//    private Tea greenTea = new Tea("Green royal tea", 450, 54, DrinkSortType.GREEN, 0,
//            DrinkType.TEA, 2);
//    private Tea blackTea = new Tea("Obama`s local tea", 950, 94, DrinkSortType.BLACK, 0,
//            DrinkType.TEA, 6);
//    private Tea fruitTea = new Tea("Dracon`s fruit tea", 450, 74, DrinkSortType.FRUIT, 0,
//            DrinkType.TEA, 3);
//    private Drink water = new Drink();
//
//    private List<CoffeeDrink> menu = new LinkedList<>();
//
//    MenuManager coffeeMine = new MenuManager();
//
//    @Test
//    void printMenu() {
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        String menuActual = "";
//        for (Drink drink : coffeeMine.getAvailableDrinks()) {
//            menuActual += "" + drink + "\n";
//        }
//
//        String menuExpected = "cocoa: Hot Milk Chocolate, 150ml, 16$ , chocolate x2, milk: 110ml , coffee: 0ml \n" +
//                "coffee: Cappuchino, 250ml, 15$ ,JAR, milk: 150ml , coffee: 100ml \n" +
//                "tea: Green royal tea, 450ml, 54$, 2 cups, coffee: 0\n" +
//                "other: Water, 250ml, 0$\n";
//
//        assertEquals(menuExpected, menuActual);
//    }
//
//    @Test
//    void print() {
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        String menuExpected = "cocoa: Hot Milk Chocolate, 150ml, 16$ , chocolate x2, milk: 110ml , coffee: 0ml \n" +
//                "coffee: Cappuchino, 250ml, 15$ ,JAR, milk: 150ml , coffee: 100ml \n" +
//                "tea: Green royal tea, 450ml, 54$, 2 cups, coffee: 0\n" +
//                "other: Water, 250ml, 0$\n";
//
//        String menuActual = "";
//        for (Drink drink : coffeeMine.getAvailableDrinks()) {
//            menuActual += "" + drink + "\n";
//        }
//
//        assertEquals(menuExpected, menuActual);
//    }
//
//    @Test
//    void sortByCoffeeAmount() {
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//
//        menu.add(espresso);
//        menu.add(cappuchino);
//        menu.add(americano);
//        menu.add(nescafe);
//        menu.add(groundedCoffee);
//
//        List<CoffeeDrink> coffees = coffeeMine.findCoffees();
//        coffeeMine.sortByCoffeeAmount(coffees);
//
//        assertEquals(coffees, menu);
//    }
//
//    @Test
//    void findBySortOfDrink() {
//        String type="InStant";
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        List<Drink> drinksExpected=coffeeMine.findBySortOfDrink(type);
//
//        List<CoffeeDrink> drinksActual = new LinkedList<>();
//        drinksActual.add(espresso);
//        drinksActual.add(nescafe);
//        drinksActual.add(cappuchino);
//
//        assertEquals(drinksExpected, drinksActual);
//    }
//
//    @Test
//    void findByPackOfDrink() {
//       String pack = "JaR";
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        List<CoffeeDrink> drinksExpected=coffeeMine.findByPackOfDrink(pack);
//
//        List<CoffeeDrink> drinksActual = new LinkedList<>();
//        drinksActual.add(espresso);
//        drinksActual.add(cappuchino);
//
//        assertEquals(drinksExpected, drinksActual);
//    }
//
//    @Test
//    void findCoffees() {
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        List<CoffeeDrink> drinksExpected=coffeeMine.findCoffees();
//
//        List<CoffeeDrink> drinksActual = new LinkedList<>();
//        drinksActual.add(espresso);
//        drinksActual.add(americano);
//        drinksActual.add(nescafe);
//        drinksActual.add(cappuchino);
//        drinksActual.add(groundedCoffee);
//
//        assertEquals(drinksExpected, drinksActual);
//    }
//
//    @Test
//    void findTeas() {
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        List<Tea> drinksExpected=coffeeMine.findTeas();
//
//        List<Tea> drinksActual = new LinkedList<>();
//        drinksActual.add(greenTea);
//        drinksActual.add(blackTea);
//        drinksActual.add(fruitTea);
//
//        assertEquals(drinksExpected, drinksActual);
//    }
//
//    @Test
//    void findCocoas() {
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//
//        List<CocoaDrink> drinksExpected=coffeeMine.findCocoas();
//
//        List<CocoaDrink> drinksActual = new LinkedList<>();
//        drinksActual.add(hotMilkChocolate);
//
//        assertEquals(drinksExpected, drinksActual);
//    }
//
//    @Test
//    void function(){
//        coffeeMine.getAvailableDrinks().add(hotMilkChocolate);
//        coffeeMine.getAvailableDrinks().add(espresso);
//        coffeeMine.getAvailableDrinks().add(americano);
//        coffeeMine.getAvailableDrinks().add(nescafe);
//        coffeeMine.getAvailableDrinks().add(cappuchino);
//        coffeeMine.getAvailableDrinks().add(greenTea);
//        coffeeMine.getAvailableDrinks().add(blackTea);
//        coffeeMine.getAvailableDrinks().add(fruitTea);
//        coffeeMine.getAvailableDrinks().add(groundedCoffee);
//        coffeeMine.getAvailableDrinks().add(water);
//        DrinkWriter drinkWriter = new DrinkWriter();
//        drinkWriter.writeToFile(coffeeMine.getAvailableDrinks());
//    }
//}