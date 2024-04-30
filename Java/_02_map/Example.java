package _02_map;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        List<Double> temperatures_kelvin = temperatures_celsius.stream()
                                            .map(c -> c + 273.15)
                                            .collect(Collectors.toList());

        System.out.println(temperatures_kelvin);
    }
}
