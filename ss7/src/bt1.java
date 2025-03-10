import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi 1");
        String inupt_1 = sc.nextLine();
        System.out.println("Nhap chuoi 2");
        String inupt_2 = sc.nextLine();
        System.out.println("Nhap chuoi 3");
        String inupt_3 = sc.nextLine();
        StringBuilder ouput = new StringBuilder();
        ouput.append(" "+inupt_1);
        ouput.append(" "+inupt_2);
        ouput.append(" "+inupt_3);
        System.out.println("Cuoi :"+ouput.toString());
    }
}
