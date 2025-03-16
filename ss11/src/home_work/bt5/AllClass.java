package home_work.bt5;

public class AllClass {

    public static class Circle implements iColorable {
        private int radius;
        String color;


        public Circle (int radius , String color){
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }
        public void display() {
            System.out.println("Ban kinh"+" "+radius + "Mau"+" " + color);
        }
    }

    public static class Rectangle  implements iColorable {
        int x;
        int y;
        String color;

        public Rectangle(int i, int y, String color) {
            this.x = i;
            this.y = y;
            this.color = color;
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }
        public void display() {
            System.out.println("Chieu dai : "+x + " ,Chieu rong : "+y+ ", Mau : " +color);
        }
    }


    public static class Square  implements iColorable {
        int x;
        String color;

        public Square(int i, String color) {
            this.x = i;
            this.color = color;
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }
        public void display() {
            System.out.println("Canh : "+x+" " + "Mau : " +color);
        }
    }


}


