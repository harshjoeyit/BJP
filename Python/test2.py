from collections import OrderedDict

od = OrderedDict()
n = int(input())

for _ in range(n) :
      str = input()
      if str in od:
            od[str] += 1
      else :
            od[str] = 1

print(len(od))
for item in od.values():
      print(item, end=" ")
print()