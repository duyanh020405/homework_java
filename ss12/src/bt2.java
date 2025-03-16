class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class bt2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sumTwoNumbers = calc.add(5, 10);
        System.out.println("Tổng của 5 và 10 là: " + sumTwoNumbers);
        int sumThreeNumbers = calc.add(5, 10, 15);
        System.out.println("Tổng của 5, 10 và 15 là: " + sumThreeNumbers);
    }
}
