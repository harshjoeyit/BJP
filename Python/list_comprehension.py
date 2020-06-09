# list comprehension

squares = [x**2 for x in range(10)]
print(squares)

""" 
combs = []
for x in [1, 2, 3]
    for y in [3, 1, 4]
        if x != y
            combs.append((x, y));            
"""
# using list compreshension 
combs = [(x, y) for x in [1, 2, 3] for y in [3, 1, 4] if x != y]
print(combs)


# create a list with double the values of the given list 
vec = [-4, -2, 3, 0, 5]
new_vec = [x*2 for x in vec]
print(new_vec)

# filter for >= 0 elements
new_vec = [x for x in vec if x >= 0]
print(new_vec)

# apply a function to all the elements 
new_vec = [abs(x) for x in vec]
print(new_vec)

# call a method on each element
fruits = [' banana  ', ' mango   ', ' plum  ']
stripped_fruits = [x.strip() for x in fruits]
print(stripped_fruits)

# create a list of tuple (x, x*x)
new_vec = [(x, x*x) for x in vec]
print(new_vec)

# flatten a list 
vec = [[1, 2, 3, 4], [5, 6], [7], [8, 9, 10, 11]]
new_vec = [num for elem in vec for num in elem]
print(new_vec)

