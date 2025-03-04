package ss2;
import java.util.Scanner;
public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gio phut giay hien tai");
        System.out.println("Nhap gio :");
        int hour = sc.nextInt();
        System.out.println("Nhap phut :");
        int min = sc.nextInt();
        System.out.println("Nhap giay :");
        int sec = sc.nextInt();
        System.out.println("Thoi gian hien tai : " + hour + ":" + min + ":" + sec);

        System.out.println("Nhap gio phut giay muon them :");
        System.out.println("Nhap gio muon them :");
        int hour2 = sc.nextInt();
        System.out.println("Nhap phut muon them :");
        int min2 = sc.nextInt();
        System.out.println("Nhap giay muon them :");
        int sec2 = sc.nextInt();

        int totalhour = hour2 + hour;
        int totalmin = min2 + min;
        int totalsec = sec2 + sec;


        if(totalsec >= 60 ){
            totalsec =totalsec % 60;
            totalmin += totalsec /60 ;
        }
        else if(totalmin >= 60 ){
            totalmin = totalmin % 60;
            totalhour += totalmin / 60 ;
        }
        else if(totalhour > 24){
            totalhour -= 24;
        }
        System.out.println("Nhap gio phut giay sau khi them : " + totalhour + ":" + totalmin + ":" + totalsec);
    }
}
