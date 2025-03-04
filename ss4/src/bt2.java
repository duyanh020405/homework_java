import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        System.out.println("Nhập số n để kiểm tra");
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        int number_2 = 0 ;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                number_2 +=1 ;
            }
        }
        if(number_2 >2){
            System.out.println("Đây không phải số nguyên tố");
        }
        else {
            System.out.println("Đây là số nguyên tố");
        }

    }
}
