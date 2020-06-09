""" 
This is a Comment 
"""

# Scope just works as C++

# Define in one line 
x, y, z = 10, 20, 30

# Define same value 
x = y = z = 50

# global vaiables
# use the global keyword if you want to change a global variable inside a function.
#  
def testfunc():
    global x
    x = 13
def testfunc2():
    global y
    y = 99

print(x)
testfunc()
print(x)
testfunc2()
print(y)

# Random

import random
print(random.randrange(1, 10))


b = "abcdefghijklmnopqrstuvwxyz"
print(b.upper())

b = "this is america 39"
print(b.split())


# cool way of running a loop from n times(input <-- n)
# for _ in range((int)(input())):
#     print('hello', end=' ')


# printing a list without the brackets
result = ['hey', 'baby', 'come on']
print(*result, sep=' ')


# dictionaries are multisets in python 
""" 
    to make a multiset 
    
    if key in dict:
        dict.append(value)
    else:
        dict[key] = value
"""


# space separated list input 
entry = list(map(str, input().split()))



# for checking if any of the elements satify a given condition

# print if any char is alphnum()
print (any([char.isalnum() for char in S]))

# print if any number is = 2
ls = list(map(int, input().split()))
print (any([x == 2 for x in ls]))



# using defaullt dict to find all indices of a number 
from collections import defaultdict

dd = defaultdict(list)
li = [2, 3, 4, 5, 1, 2, 3, 4, 2, 3, 4, 4]

for i in range(0, len(li)):
    val = li[i]
    dd[val].append(i)

for i in dd.items():
    print(i)


    

# handling precision 
a = 12.33333333333
print('%.2f' %a)