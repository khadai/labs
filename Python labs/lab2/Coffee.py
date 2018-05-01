from CoffeePackageType import CoffeePackageType
from Drink import Drink
from DrinkType import DrinkType
from DrinkSortType import DrinkSortType


class Coffee(Drink):
    coffee_pack = CoffeePackageType.PACK
    coffee_amount = 0

    def __init__(self, m_name="Coffee", m_capacity=250, m_price=0, m_sort=DrinkSortType.OTHER,
                 m_drink_type=DrinkType.COFFEE, m_coffee_pack=CoffeePackageType.PACK, m_coffee_amount=0):
        super().__init__(m_name, m_capacity, m_price, m_sort, m_drink_type)
        self.coffee_pack = m_coffee_pack
        self.coffee_amount = m_coffee_amount

    def reset_values(self, m_name, m_capacity, m_price, m_milk_amount, m_sort, m_drink_type, m_coffee_pack,
                     m_coffee_amount):
        super().reset_values(m_name, m_capacity, m_price, m_milk_amount, m_sort, m_drink_type, m_coffee_amount)
        self.coffee_pack = m_coffee_pack
        self.coffee_amount = m_coffee_amount

    def to_string(self):
        return str(self.sort_of_drink.name.lower())+ ' coffee: ' + self.name + ', ' + str(self.capacity) + 'ml, ' + str(
            self.price) + '$, ' + 'pack: ' + str(self.coffee_pack.name) + ', coffee: ' + str(self.coffee_amount)
