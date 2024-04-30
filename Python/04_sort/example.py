temperatures_cities = [('New York', 10), ('Los Angeles', 20), ('Chicago', 5), ('Houston', 25)]

sorted_cities = sorted(temperatures_cities, key = lambda x: x[1])
print(sorted_cities)