import presentation.StudentUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("--------------- Menu ------------------");
            System.out.println("1. Student Management");
            System.out.println("2. Class Management");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StudentUI.displayStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }



        }while(true);


    }
}
