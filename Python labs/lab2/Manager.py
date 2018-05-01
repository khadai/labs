class Manager:
    available_drinks = []
    name = 'no name'

    def __init__(self, m_name='no name', m_available_drink=[]):
        self.available_drinks = m_available_drink
        self.name = m_name

    def add_drink(self, drink):
        self.available_drinks.append(drink)

    def print_menu(self):
        for drink in self.available_drinks:
            print(drink.to_string())

    def print_list(self, drink_list):
        for drink in drink_list:
            print(drink.to_string())

    def sort_by_coffee_amount(self, list):
        list.sort(key=lambda x: x.coffee_amount, reverse=False)

    def find_by_type_of_drink(self, type):
        type_list = []
        for drink in self.available_drinks:
            if str(drink.sort_of_drink.name).lower() == type.lower():
                type_list.append(drink)
        if type_list.__len__() >= 1:
            return type_list
        else:
            print("There is no drink with such type!")

    def find_by_pack_of_drink(self, pack):
        pack_list = []
        coffee_list = self.find_drink_type("coffee")
        for drink in coffee_list:
            if str(drink.coffee_pack.name).lower() == str(pack.lower()):
                pack_list.append(drink)
        if pack_list.__len__() >= 1:
            return pack_list
        else:
            print("There is no drink with such pack!")

    def find_drink_type(self, m_drink_type):
        coffee_list = []
        for drink in self.available_drinks:
            if drink.drink_type.name.lower() == str(m_drink_type).lower():
                coffee_list.append(drink)
        if coffee_list.__len__() >= 1:
            return coffee_list
        else:
            print("There is no coffee in the menu!")

