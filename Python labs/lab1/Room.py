class Room:
    width, length, height, room_area, total_room_area = 0, 0, 2, 0, 0
    type = 'no type'

    def __init__(self, _type='', _width=0, _length=0, _height=0):
        self.type = _type
        self.width = _width
        self.length = _length
        self.height = _height
        self.room_area = self.length * self.width
        Room.total_room_area += self.length * self.width

    def to_string(self):
        return 'The width of the ' + self.type + ' room is ' + str(self.width) + ', the length is ' + str(self.length) \
               + ', it`s height is ' + str(self.height) + ', room area is ' + str(self.room_area) + ' square units'

    def print_sum(self):
        print('The area of ' + self.type + '-room is ' + str(self.room_area) + ' square units')

    @staticmethod
    def print_total_area():
        print('The total square of all rooms is ' + str(Room.total_room_area) + ' square units')


if __name__ == '__main__':
    cabinet = Room()
    bedroom = Room('bed', 4, 5, 2.4)
    dining_room = Room('dining', 3, 6)
    print(cabinet.to_string())
    print(bedroom.to_string())
    print(dining_room.to_string())
    Room.print_total_area()
    bedroom.print_sum()
    dining_room.print_sum()
