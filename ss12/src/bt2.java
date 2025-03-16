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
        System.out.println("Tổng 2 so: " + sumTwoNumbers);
        int sumThreeNumbers = calc.add(5, 10, 15);
        System.out.println("Tổng 3 so: " + sumThreeNumbers);
    }
}
