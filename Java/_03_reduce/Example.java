package _03_reduce;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> temperatures_celsius = List.of(25, 30, 22, 18, 28, 35, 20);

        int sum = temperatures_celsius.stream()
                    .reduce(0, (x, y) -> x + y);

        System.out.println(sum);
    }
}
