package _04_sort;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> temperatures_cities = new ArrayList<>();
        temperatures_cities.add(Map.entry("New York", 10));
        temperatures_cities.add(Map.entry("Los Angeles", 20));
        temperatures_cities.add(Map.entry("Chicago", 5));
        temperatures_cities.add(Map.entry("Houston", 25));

        Collections.sort(temperatures_cities, (entry1, entry2) -> entry1.getValue() - entry2.getValue());

        System.out.println(temperatures_cities);
    }
}
