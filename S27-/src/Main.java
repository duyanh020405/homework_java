

import java.util.Scanner;
import presentation.StudentUI;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("--------------- Menu ------------------");
            System.out.println("1. Student Management");
            System.out.println("2. Class Management");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentUI.displayStudent();
                case 2:
                case 3:
            }
        }
    }
}
