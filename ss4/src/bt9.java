import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int N = in.nextInt();
        System.out.println("Các số Palindrome từ 1 đến " + N + " là:");
        for(int i = 1; i <= N; i++){
            int old_number = i;
            int number_reserved = 0 ;
            int num = i ;
            while( num > 0){
                int last_number = num % 10;
                number_reserved = number_reserved * 10 + last_number;
                num = num / 10;
        }
            if(number_reserved == old_number){
                System.out.println(old_number);
            }
        }
    }
}
