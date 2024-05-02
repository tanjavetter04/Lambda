package example;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum() {
            public int add(int x, int y) {
                return x + y;
            }
        };
        System.out.println(sum.add(3, 5));

        Sum sum2 = (x, y) -> x + y;
        System.out.println(sum2.add(3, 5));

        Sum sum3 = (x, y) -> {
            System.out.println("Adding...");
            return x + y;
        };
        System.out.println(sum3.add(3, 5));
    }
}