package exercise;

// Berechne das Produkt von 2 Zahlen mithilfe einer Lambda Funktion

public class Main {
    public static void main(String[] args) {
        Product product = (x, y) -> x * y;
        System.out.println(product.multiply(3, 5));
    }
}
