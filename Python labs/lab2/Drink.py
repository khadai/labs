from DrinkSortType import DrinkSortType
from DrinkType import DrinkType


class Drink:
    name, capacity, price, sort_of_drink, drink_type, coffee_amount = 'Water', 250, 0, DrinkSortType.OTHER, DrinkType.OTHER, 0

    def __init__(self, m_name="Water", m_capacity=250, m_price=0, m_sort=DrinkSortType.OTHER,
                 m_drink_type=DrinkType.OTHER):
        self.name = m_name
        self.capacity = m_capacity
        self.price = m_price
        self.sort_of_drink = m_sort
        self.drink_type = m_drink_type

    def reset_values(self, m_name, m_capacity, m_price, m_sort, m_drink_type):
        self.name = m_name
        self.capacity = m_capacity
        self.price = m_price
        self.sort_of_drink = m_sort
        self.drink_type = m_drink_type

    def to_string(self):
        return 'other: ' + self.name + ', ' + str(self.capacity) + 'ml, ' + str(self.price) + '$'

