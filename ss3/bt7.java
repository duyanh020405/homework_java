package ss3;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2) ||
                    Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2) ||
                    Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid triangle, please enter valid sides.");
        }

        scanner.close();
    }
}