from itertools import permutations

# # all permuations 
# print(list(permutations([1, 2, 3])));
# print()


# # permutations of size k
# k = 2
# print(list(permutations([1, 2, 3, 4], k)));

def convertTuple(tup): 
    str =  ''.join(tup) 
    return str


word, k = input().split()
word = list(word)
word.sort()
perm = list(permutations(word, int(k)))

for tup in perm:
    print(convertTuple(tup))