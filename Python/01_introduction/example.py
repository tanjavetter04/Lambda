def add(x,y):
    return x+y

print(add(3,5))

print((lambda x,y: x+y)(3,5))

sum = lambda x,y: x+y
print(sum(3,5))

def adder(x):
    return lambda y: x + y

add5 = adder(5)
print(add5(1))