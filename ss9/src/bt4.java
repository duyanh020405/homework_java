import java.util.Scanner;

public class bt4 {
    static class Circle {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return radius * radius * Math.PI;
        }
        public double getCircumference() {
            return 2 * radius * Math.PI;
        }
        public void display() {
            System.out.println("Dien tich : " + getArea());
            System.out.println("Chu vi: " + getCircumference());
            System.out.println("Ban kinh: " + radius);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        double radius = sc.nextDouble();
        double default_radius = 10;
        if (radius < 0) {
            System.out.println("Err");
        }
        else {
            Circle r = new Circle(radius);
            r.display();
        }
        sc.close();
    }
}