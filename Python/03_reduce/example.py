from functools import reduce

temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

sum = reduce(lambda x,y: x + y, temperatures_celsius)
print(sum)