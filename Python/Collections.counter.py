from collections import Counter

mylist = [3, 4, 1, 1, 2, 2, 3, 2, 1, 2, 1, 1, 3]
dic = Counter(mylist)
print(dic)
print(dic.items())
print(dic.keys())
print(dic.values())


fruits = ['watermelon', 'apple', 'apple', 'mango', 'avocado', 'avocado']
fruits.sort()
print(Counter(fruits))