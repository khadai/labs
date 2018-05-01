from Coffee import Coffee
from Manager import Manager
from CoffeePackageType import CoffeePackageType
from Drink import Drink
from DrinkType import DrinkType
from DrinkSortType import DrinkSortType
from Tea import Tea

if __name__ == "__main__":
    coffee_mine = Manager()

    water = Drink()
    coffee_mine.add_drink(water)
    coffee_mine.add_drink(Coffee("Espresso", 50, 12, DrinkSortType.INSTANT, DrinkType.COFFEE,
                                 CoffeePackageType.JAR, 50))
    coffee_mine.add_drink(Coffee("Americana", 150, 16, DrinkSortType.CEREAL, DrinkType.COFFEE,
                                 CoffeePackageType.PACK, 110))
    coffee_mine.add_drink(Coffee("Nescafe", 250, 5, DrinkSortType.INSTANT, DrinkType.COFFEE,
                                 CoffeePackageType.PACK, 150))
    coffee_mine.add_drink(Coffee("Cappuccino", 250, 15, DrinkSortType.INSTANT, DrinkType.COFFEE,
                                 CoffeePackageType.JAR, 100))

    coffee_mine.add_drink(Coffee("Grounded coffee", 250, 46, DrinkSortType.GROUNDED,
                                 DrinkType.COFFEE, CoffeePackageType.PACK, 250))
    coffee_mine.add_drink(Tea("Green royal tea", 450, 54, DrinkSortType.GREEN, DrinkType.TEA, 2))
    coffee_mine.add_drink(Tea("Osaka`s local tea", 950, 94, DrinkSortType.BLACK, DrinkType.TEA, 6))
    coffee_mine.add_drink(Tea("Dragon`s fruit tea", 450, 74, DrinkSortType.FRUIT, DrinkType.TEA, 3))

    print("Menu before sort: ")
    coffee_mine.print_menu()

    print("\nMenu after sort:")
    coffee_mine.sort_by_coffee_amount(coffee_mine.available_drinks)
    coffee_mine.print_menu()

    print("#######\nTeas:")
    coffee_mine.print_list(coffee_mine.find_drink_type('tea'))

    print("\Coffees:")
    coffee_mine.print_list(coffee_mine.find_drink_type('coffee'))

    print("#######\n Coffee with jar-pack:")
    coffee_mine.print_list(coffee_mine.find_by_pack_of_drink('jar'))

    print('\n Instant coffees:')
    coffee_mine.print_list(coffee_mine.find_by_type_of_drink('instant'))

