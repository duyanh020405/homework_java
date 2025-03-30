import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap so n :");
            int n = sc.nextInt();
            System.out.println("Bạn đã nhập:"+n);
        }
        catch(Exception e){
            System.out.println("Lỗi: Bạn phải nhập số nguyên");
        }
        finally {
            sc.close();
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }
}
