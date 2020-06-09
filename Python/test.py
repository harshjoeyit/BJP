

# .......................sorted function in python


# vowels list
py_list = ['e', 'a', 'u', 'o', 'i']
print(sorted(py_list))

# string
py_string = 'Python'
print(sorted(py_string))

# vowels tuple
py_tuple = ('e', 'a', 'u', 'o', 'i')
print(sorted(py_tuple, reverse = True))




names = ["harshit", "tim", "savvy", "kelly", "adam"]

# print in descending order of length 
print(sorted(names, key=len, reverse = True))




# (Student's Name, Marks out of 100, Age)

participant_list = [
    ('Alison', 50, 18),
    ('Terence', 75, 12),
    ('David', 75, 20),
    ('Jimmy', 90, 22),
    ('John', 45, 12),
    ('David', 75, 10),
    ('Jimmy', 90, 32),
    ('John', 45, 11)
]

""" 
We want to sort the list in such a 
way that the student with the highest 
marks is in the beginning. In case 
the students have equal marks, they 
must be sorted so that the younger 
participant comes first.
"""

def comp(item):
        rem = 100 - item[1]
        age = item[2]
        return (rem, age)               # the one with lesser rem, lesser age (if rem is same) comes first 

sorted_part_list = sorted(participant_list, key = comp)

for item in sorted_part_list:
        print(item)



# lambda ...............................

print()
sorted_list = sorted(participant_list, key=lambda item: (100-item[1], item[2]))
for item in sorted_part_list:
        print(item)