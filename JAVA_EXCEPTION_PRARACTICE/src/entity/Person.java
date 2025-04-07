package entity;

import java.util.Scanner;

public class Person implements IApp {
    String name;
    int age;
    String address;
    String phone;
    String email;
    Sex sex;

    public enum Sex {
        MALE, FEMALE, OTHER
    }

    public Person(String name, int age, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void inputData(Scanner scanner) {
        final String regex = "^(.+)@(.+)$";
        System.out.print("Enter name: ");
        String personName = scanner.nextLine().trim();
        System.out.print("Enter age: ");
        int personAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter address: ");
        String personAddress = scanner.nextLine();
        System.out.print("Enter phone: ");
        String personPhone = scanner.nextLine();
        System.out.print("Enter email: ");
        String personEmail = scanner.nextLine();
        System.out.print("Enter sex (MALE/FEMALE/OTHER): ");
        String personSexInput = scanner.nextLine().toUpperCase();
        if (!personName.isEmpty() && personName.length() < 100
                && personAge >= 18
                && !personAddress.isEmpty()
                && personPhone.startsWith("0") && personPhone.length() >= 10 && personPhone.length() <= 100
                && personEmail.length() >= 10 && personEmail.length() <= 100 && personEmail.matches(regex)) {

            try {
                Sex personSex = Sex.valueOf(personSexInput);
                this.name = personName;
                this.age = personAge;
                this.address = personAddress;
                this.phone = personPhone;
                this.email = personEmail;
                this.sex = personSex;
                System.out.println("Person data saved successfully.");
            } catch (IllegalArgumentException e) {
                System.out.println("Sex vaue is not valid.");
            }
        } else {
            System.out.println("Invalid input data.");
        }
    }
}
