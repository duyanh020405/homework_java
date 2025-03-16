package home_work.bt5;

public class AllClass {
    interface iColorable {
        void setColor(String color);
    }

    static class Circle implements iColorable {
        private int radius;
        private String color;

        public Circle(int radius, String blue) {
            this.radius = radius;
            this.color = "No color";
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }

        public void display() {
            System.out.println("Bán kính: " + radius + ", Màu: " + color);
        }
    }

    static class Rectangle implements iColorable {
        private int length;
        private int width;
        private String color;

        public Rectangle(int length, int width, String red) {
            this.length = length;
            this.width = width;
            this.color = "No color";
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }

        public void display() {
            System.out.println("Chiều dài: " + length + ", Chiều rộng: " + width + ", Màu: " + color);
        }
    }

    static class Square implements iColorable {
        private int side;
        private String color;

        public Square(int side, String blue) {
            this.side = side;
            this.color = "No color";
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }

        public void display() {
            System.out.println("Cạnh: " + side + ", Màu: " + color);
        }
    }

        public static void main(String[] args) {
            Circle circle = new Circle(5, "Blue");
            Rectangle rectangle = new Rectangle(10, 5, "Red");
            Square square = new Square(7, "Blue");

            circle.setColor("Đỏ");
            rectangle.setColor("Xanh");
            square.setColor("Vàng");

            circle.display();
            rectangle.display();
            square.display();
        }
    }