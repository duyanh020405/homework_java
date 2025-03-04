package ss3;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc ba ax^3 + bx^2 + cx + d = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        System.out.print("Nhập hệ số d: ");
        double d = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Phương trình trở thành bậc hai: " + b + "x^2 + " + c + "x + " + d + " = 0");
            solveQuadraticEquation(b, c, d);
        } else {
            solveCubicEquation(a, b, c, d);
        }

        scanner.close();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Phương trình có vô số nghiệm" : "Phương trình vô nghiệm");
            } else {
                System.out.println("Nghiệm của phương trình: x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: x = " + (-b / (2 * a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

    public static void solveCubicEquation(double a, double b, double c, double d) {
        double delta0 = b * b - 3 * a * c;
        double delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;
        double discriminant = delta1 * delta1 - 4 * delta0 * delta0 * delta0;

        if (discriminant > 0) {
            double C = Math.cbrt((delta1 + Math.sqrt(discriminant)) / 2);
            double x1 = -1 / (3 * a) * (b + C + delta0 / C);
            System.out.println("Phương trình có một nghiệm thực: x = " + x1);
        } else if (discriminant == 0) {
            double x1 = -b / (3 * a);
            double x2 = -b / (3 * a) + Math.cbrt(d / a);
            System.out.println("Phương trình có nghiệm kép: x1 = " + x1 + ", x2 = " + x2);
        } else {
            double theta = Math.acos(delta1 / (2 * Math.sqrt(delta0 * delta0 * delta0)));
            double x1 = -2 * Math.sqrt(delta0) * Math.cos(theta / 3) - b / (3 * a);
            double x2 = -2 * Math.sqrt(delta0) * Math.cos((theta + 2 * Math.PI) / 3) - b / (3 * a);
            double x3 = -2 * Math.sqrt(delta0) * Math.cos((theta - 2 * Math.PI) / 3) - b / (3 * a);
            System.out.println("Phương trình có ba nghiệm thực:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("x3 = " + x3);
        }
    }
}