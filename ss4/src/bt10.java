import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        System.out.println("Chọn các chức năng : ");
        System.out.println("1. Kiểm tra một số có phải là số nguyên tố không");
        System.out.println("2. Kiểm tra một số có phải là số hoàn hảo không.");
        System.out.println("3. Tìm và tính tổng tất cả các ước của một số.");
        System.out.println("4. Thoát chương trình.");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                int total = 0;
                for(int i = 1 ; i < number; i++){
                    if(number % i == 0){
                        total +=1;
                    }
                }
                if(total >2){
                    System.out.println("Đây không phải là số nguyên tố");
                }
                else {
                    System.out.println("Đây là số nguyên tố");
                }
                break;
            case 2:
                int total_2 = 0;
                for(int i = 1 ; i < number; i++){
                    if(number % i == 0){
                        total_2 +=i;
                    }
                }
                if(total_2 == number){
                    System.out.println("Đây là số hoàn hảo");
                }
                else {
                    System.out.println("Đây không là số hoàn hảo");
                }
                break;
            case 3:
                int total_3 = 0;
                System.out.printf("Các ước cú %d",number);
                for(int i = 1 ; i < number; i++){
                    if(number % i == 0){
                        total_3 +=i;
                    }
                }
                System.out.printf("Tổng các ước : %d",total_3);
                break;
            case 4:
                break;
        }
    }
}
