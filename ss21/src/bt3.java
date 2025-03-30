import java.util.Scanner;

public class bt3 {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Bạn chưa đủ 18 tuổi!");
        } else {
            System.out.println("Chào mừng bạn!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap tuoi :");
            int age = sc.nextInt();
            checkAge(age);
            
        }
        catch (Exception e) {
            System.out.println("Loi :"+e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
