package ss2;

public class bt3 {
    int x = 1;
    int y = 2;
    double z = 10.23;
    double h = 10.2;

    public void checkXY() {
        boolean check = (x > y);
        boolean check2 = (x != y);
        boolean check3 = (x >= y);
        boolean check4 = (x <= y);
        boolean check5 = (x < y);

        boolean checkzh = (z > h);
        boolean checkzh2 = (z != h);
        boolean checkzh3 = (z >= h);
        boolean checkzh4 = (z < h);
        boolean checkzh5 = (z == h);

        System.out.println("x > y = " + check);
        System.out.println("x != y = " + check2);
        System.out.println("x >= y = " + check3);
        System.out.println("x <= y = " + check4);
        System.out.println("x < y = " + check5);
        System.out.println("x > y = " + check);

        System.out.println("z > h = " + checkzh);
        System.out.println("z != h = " + checkzh2);
        System.out.println("z >= h = " + checkzh3);
        System.out.println("z < h = " + checkzh4);
        System.out.println("z == h = " + checkzh5);
    };
    public void checkXY2(){
        if (x > y){
            System.out.println("x > y " );
        };
        if(x < y){
            System.out.println("x < y " );
        }
        else{
            System.out.println("x = y " );
        }
    }

    public static void main(String[] args) {
        bt3 obj = new bt3();
        obj.checkXY();
    }
}
