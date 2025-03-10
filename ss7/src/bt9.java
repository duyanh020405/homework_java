import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();

        sc.close();
        int count = 1;
        for (int i = 0; i < input.length()-2; i++) {
            char ch = input.charAt(i);
            if (input.charAt(i+1) == ch) {
                count++;
            }
            else{
                output.append(ch);
                output.append(count);
            }
        }
        output.append(input.charAt(input.length() - 1)).append(count);
        System.out.println(output);
    }
}