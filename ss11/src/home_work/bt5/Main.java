package home_work.bt5;

public class Main {
    public static void main(String[] args) {
        AllClass.Rectangle rectangle = new AllClass.Rectangle(1,2,"Red");
        rectangle.setColor("Blue");

        AllClass.Square square = new AllClass.Square(4,"Blue");
        square.setColor("Green");

        AllClass.Circle circle = new AllClass.Circle(4,"Blue");
        circle.setColor("Yellow");

        circle.display();
        square.display();
        rectangle.display();



    }
}
