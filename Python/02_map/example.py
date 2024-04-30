temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

temperatures_kelvin = map(lambda c: c + 273.15, temperatures_celsius)
print(list(temperatures_kelvin))