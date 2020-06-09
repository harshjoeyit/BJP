from collections import namedtuple

Point = namedtuple('Point', 'x, y')

pt1 = Point(1, 2)
pt2 = Point(3, 4)

dotProduct = (pt1.x * pt2.x + pt1.y * pt2.y)
print(dotProduct)


Car = namedtuple('Car', 'price milege color')

car1 = Car(price=100, milege=10, color='red')
car2 = Car(200, 30, 'cyan')
print(car1)