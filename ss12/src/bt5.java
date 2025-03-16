import java.util.ArrayList;
import java.util.List;

public class bt5 {
    static class Shape {
        public double area() {
            return 0 ;
        }
    }

    static class Circle  extends Shape {
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double area() {
            return Math.PI*radius*radius;
        }
    }

    static class Retangle extends Shape {
        double h;
        double w;
        public Retangle(double h, double w) {
            this.h = h;
            this.w = w;
        }

        public double area() {
            return h * w ;
        }
    }

    static class Square  extends Shape {
        double h;
        public Square (double h) {
            this.h = h;
        }

        public double area() {
            return h * h ;
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        shapes.add(new Retangle(4,5));
        shapes.add(new Square(5));

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }



}
