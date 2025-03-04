package ss2;

public class bt1 {
    int songuyen;
    double sothuc;
    char motkitu;
    String chuoikitu;

    // Constructor để gán giá trị
    public bt1() {
        songuyen = 1;
        sothuc = 1.2;
        motkitu = 'q';
        chuoikitu = "DuyAnh";
    }

    public void showInfo() {
        int songuyen2 = 2;
        int total = songuyen + songuyen2;
        System.out.println("Số nguyên 1: " + songuyen + " + Số nguyên 2: " + songuyen2 + " = " + total);
    }
    public void shoeInfo2 (){
        double r = 1.2;
        double s = 3.14 * r*r ;
        System.out.println("S = " + s);
    }

    public static void main(String[] args) {
        bt1 obj = new bt1();
        obj.showInfo();
        obj.shoeInfo2();
    }
}
