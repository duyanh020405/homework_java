package ss2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap ngay thang nam theo (yyyy-mm-dd): ");
       String inputdate = sc.nextLine();
       LocalDate date = LocalDate.parse(inputdate);

       System.out.println("Chon tac vu :");
       System.out.println("1.tinh ngay tiep theo");
       System.out.println("2.Tinh khoang cach 2 ngay");
       int choice = sc.nextInt();
       switch (choice) {
           case 1 :
               LocalDate nextday = date.plusDays(1);
               System.out.println("Ngay tiep theo : "+nextday);
           break ;
           case 2 :
               sc.nextLine();
               System.out.println("Nhap ngay muon tinh khoang cach : ");
               String inputdate2 = sc.nextLine();
               LocalDate date2 = LocalDate.parse(inputdate2);
               long daysbeetween = ChronoUnit.DAYS.between(date, date2);
               System.out.println("Khoang cach giua 2 ngay : "+daysbeetween);
               break ; default :
                   System.out.println("Khong hop le ngay thang");
       }
       sc.close();
    }
}
