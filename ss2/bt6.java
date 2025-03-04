package ss2;
import java.util.Scanner;
public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban");
        String name = sc.nextLine();
        System.out.println("Nhap diem 3 mon cua ban ");
        System.out.println("Mon thu nhat : ");
        int subject1 = sc.nextInt();
        System.out.println("Mon thu hai : ");
        int subject2 = sc.nextInt();
        System.out.println("Mon thu ba : ");
        int subject3 = sc.nextInt();
        double avg =  (subject1+subject2+subject3)/3;
        String type ;
        if(avg >= 8.0){
            System.out.println("Gioi");
            type = "Gioi";
        }
        else if(  6.5 <= avg){
            System.out.println("Kha");
            type = "Kha";
        }
        else if( avg <= 5.0 ){
            System.out.println("TB");
            type = "TB";
        }
        else {
            System.out.println("Yeu");
            type = "Yeu";
        }
        sc.close();
        System.out.println("Ten : " + name + " - Diem trung binh : " + avg + "- Type :" + type);
    }
}
