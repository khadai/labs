from Drink import Drink
from  DrinkType import DrinkType
from  DrinkSortType import DrinkSortType


class Tea(Drink):
    cups_amount = 0
    coffee_amount = 0

    def __init__(self, m_name="Tea", m_capacity=250, m_price=0, m_sort=DrinkSortType.OTHER,
                 m_drink_type=DrinkType.TEA, m_cups_amount=1):
        super().__init__(m_name, m_capacity, m_price, m_sort, m_drink_type)
        self.cups_amount = m_cups_amount

    def reset_values(self, m_name, m_capacity, m_price, m_milk_amount, m_sort, m_drink_type, m_cups_amount):
        super().reset_values(m_name, m_capacity, m_price, m_milk_amount, m_sort, m_drink_type)
        self.cups_amount = m_cups_amount

    def to_string(self):
        return str(self.sort_of_drink.name.lower())+' tea: ' + self.name + ', ' + str(self.capacity) + 'ml, ' + str(self.price) + '$, ' + str(
            self.cups_amount) + ' cups, coffee: 0'

