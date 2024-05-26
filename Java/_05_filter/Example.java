package _05_filter;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        List<Integer> high_temperatures = temperatures_celsius.stream()
                                            .filter(temp -> temp > 25)
                                            .toList();

        System.out.println(high_temperatures);
    }
}
