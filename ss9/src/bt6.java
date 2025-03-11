import java.util.Scanner;

public class bt6 {
    public static class Point2D{
        double x, y;
        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX (){
            return x;
        }
        public double getY (){
            return y;
        }
        public void setX(double x){
            this.x = x;
        }
        public void setY(double y){
            this.y = y;
        }
        public double distanceTo(double x2, double y2){
            double total = Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
            return total ;
        }
        public void displayPoint(){
            System.out.println("x: " + x + " y: " + y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x :");
        int x = sc.nextInt();
        System.out.println("Nhap y :");
        int y = sc.nextInt();
        Point2D input = new  Point2D(x,y);
        System.out.println(" x : "+input.getX());
        System.out.println(" y : "+input.getY());
        input.setX(10);
        input.setY(20);
        System.out.println(" x after set : "+input.getX());
        System.out.println(" y after set : "+input.getY());
        System.out.println("After distanceTo: "+input.distanceTo(5,10));
        input.displayPoint();

    }

}
