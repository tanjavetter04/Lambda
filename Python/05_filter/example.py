temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

high_temperatures = filter(lambda temp: temp > 25, temperatures_celsius)
print(list(high_temperatures))