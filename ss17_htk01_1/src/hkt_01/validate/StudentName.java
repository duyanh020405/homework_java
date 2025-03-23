package ss17_htk01_1.src.hkt_01.validate;

import java.util.Scanner;

public class StudentName {
    private String name;

    public StudentName(Scanner sc) {
        System.out.println("Nhap ten hoc sinh :");
        String name = sc.nextLine();
        this.name = name.trim().isEmpty() ? null : name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().isEmpty() ? null : name;
    }

}
