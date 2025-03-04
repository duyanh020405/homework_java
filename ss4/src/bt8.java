import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số : ");
        String input = scanner.nextLine();
        int total = 0;
        int number = Integer.parseInt(input);
        int length = input.length();
        if(Integer.parseInt(input) >0){
            for(int i = 0; i < length; i++){
                char c = input.charAt(i);
                if(Character.isDigit(c)){
                    total += Math.pow(Character.getNumericValue(c),length) ;
                }
            }
            if(total == number){
                System.out.println("Là số Armstrong");
            }
            else{
                System.out.println("Không là số Armstrong");
            }

        }

    }
}
