from itertools import product

print(list(product([1, 2, 3], repeat = 2)))

print(list(product([1, 2, 3], [5, 6])))

A = [[4, 7, 6], [10, 11, 12]]
print(list(product(*A)))

A = ((1, 2, 3), (1, 2))
print(tuple(product(*A)))