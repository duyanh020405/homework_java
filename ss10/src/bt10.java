package ss10.src;

import java.util.ArrayList;

abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    @Override
    public String toString() {
        return "Hình: " + name + ", Diện tích: " + calculateArea() + ", Chu vi: " + calculatePerimeter();
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return super.toString() + ", Bán kính: " + radius;
    }
}
class Rectangle extends Shape {
    private double width, height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return super.toString() + ", Chiều rộng: " + width + ", Chiều cao: " + height;
    }
}
class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
    @Override
    public String toString() {
        return super.toString() + ", Cạnh a: " + a + ", Cạnh b: " + b + ", Cạnh c: " + c;
    }
}

public class bt10 {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle_bt5("Hình tròn", 5));
        shapeList.add(new Rectangle("Hình chữ nhật", 4, 6));
        shapeList.add(new Triangle("Tam giác", 3, 4, 5));
        for (Shape shape : shapeList) {
            System.out.println(shape.toString());
        }
    }
}
