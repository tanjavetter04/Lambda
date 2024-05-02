package _05_filter;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        List<Integer> high_temperatures = temperatures_celsius.stream()
                                            .filter(temp -> temp > 25)
                                            .collect(Collectors.toList());

        System.out.println(high_temperatures);
    }
}
