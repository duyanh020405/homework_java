import java.util.Scanner;

public class bt3 {
    static class Rectangle {
        double length;
        double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }

        public void display() {
            System.out.println("Length: " + length + ", Width: " + width);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect_old = new Rectangle(1,1);
        System.out.println("Nhap chieu dai va chieu rong :");
        int input_length = sc.nextInt();
        int input_width = sc.nextInt();
        if ( input_length > 1 && input_width > 1) {
            Rectangle rect = new Rectangle(input_length, input_width);
            rect.display();
            rect_old.display();
        }
        else {
            System.out.println("Err!");
        }

    }
}
