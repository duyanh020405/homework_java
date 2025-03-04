package ss2;

public class bt2 {
    int a = 1;
    int b = 5;
    int c = a+b ;
    int d = a-b;
    int e = a*b;
    double f = a/b ;
    double g = a%b ;
    public void all (){
        if(b == 0){
            System.out.println("Loi khi b = 0");
        }
        else{
        System.out.println("a + b = " + c);
        System.out.println("a - b =" + d);
        System.out.println("a * b =" + e);
        System.out.println("a / b =" + f);
        System.out.println("a % b =" + g);}
    }
    public static void main(String[] agrs){
        bt2 obj = new bt2();
        obj.all();
    }
}
