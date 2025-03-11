import java.util.Scanner;

public class bt7 {
    static class  QuadraticEquation {
        double a, b, c;
        QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            double delta = b*b - 4*a*c ;;
            return delta ;
        }
        public void hasRealRoots() {
            double delta = b*b - 4*a*c ;
            if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep");
            }
            else if(delta > 0){
                System.out.println("Phuong trinh co 2 nghiem ");
            }
            else{
                System.out.println("Phuong trinh vo nghiem ");
            }
        }

        public void getRoot1() {
            double delta = b*b - 4*a*c ;
            if(delta == 0){
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println("Nghiem : "+x);
            }
            else if(delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem 1: "+x1);
            }
            else{
                System.out.println("Phuong trinh khong co nghiem 1 ");
            }
        }

        public void getRoot2() {
            double delta = b*b - 4*a*c ;
            if(delta == 0){
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println("Nghiem : "+x);
            }
            else if(delta > 0){
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem 2: "+x2);
            }
            else{
                System.out.println("Phuong trinh khong co nghiem 2 ");
            }
        }
        public void display() {
            getRoot1();
            getRoot2();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a, b c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        qe.display();
    }
}
