List1 = []
List2 = []

List1.insert(0, 34)
List2.insert(10, 100)


# accessing values using index   
print("item at index 0 is : ", List1[0])

# for any index - in general - List[index]


# error list index out of bounds
#print("item at index 10 is : ", List2[10])




print("List1", end = " -> ")
for x in List1:
    print(x, end = " ")
print()



print("List2", end = " -> ")
for y in List2: 
    print(y, end = " ")
print()


List1.insert(1, 23)
List1.insert(2, 53)
List1.insert(3, 37)
List1.insert(4, 28)
List1.insert(10, 29)


print("List1", end = " -> ")
for x in List1:
    print(x, end = " ")
print()


