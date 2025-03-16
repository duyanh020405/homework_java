public class bt4 {
    static class Shape {
        public double area() {
            return 0;
        }
        public double area(double radius) {
            return Math.PI * radius * radius;
        }
        public double area(double width, double height) {
            return width * height;
        }
    }
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }
  static   class Rectangle extends Shape {
        private double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public double area() {
            return width * height;
        }
    }
        public static void main(String[] args) {
            Shape shape = new Shape();
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);

            System.out.println("S Shape: " + shape.area());
            System.out.println("S (Overriding): " + circle.area());
            System.out.println("S (Overriding): " + rectangle.area());
            System.out.println("S (Overloading): " + shape.area(5));
            System.out.println("S hình chữ nhật (Overloading): " + shape.area(4, 6));
        }
    }
