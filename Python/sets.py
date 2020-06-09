# string to set
print(set('harshit'))

# list to set
print(set([1,2,1,2,3,4,5,6,0,9,12,22,3]))

# dictionary to set 
dc = {}
dc['harshit'] = 10
dc['joey'] = 12
dc['pink'] = 34
st = set(dc)
print(st)


# list to sets


new_set = set([1, 2, 1, 4, 2])


print(new_set)


new_set1 = set(("a", "a", "b", "e", "b"))


print(new_set1)


new_set1.add("ravi")
new_set1.add("kelly")
new_set1.update(["kelly", "a", "optimus" ])
new_set1.update(("ravi", "kshmr"))

print(new_set1)

new_set1.discard("kelly")
new_set1.remove("a")
# new_set1.remove("z")                          Throws error  - if key is not present 

print()
print(new_set1)


# ................................................

set_a = {"a", "b", "c", "d"}
set_b = {"v", "b", "f", "a"}

print(set_a.union(set_b))
print(set_a.intersection(set_b))
print(set_a.difference(set_b))   # A - B




# ...............................................
print(sorted(set_b))
print(sorted(set_b, reverse=True))
