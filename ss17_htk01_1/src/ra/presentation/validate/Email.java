package ss17_htk01_1.src.ra.presentation.validate;

import java.util.Scanner;

public class Email {
    String email;

    public Email(Scanner sc) {
        System.out.println("Nhap email : ");
        String email = sc.nextLine();
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        }
        else {
            this.email = null;
            System.err.println("Invalid email format");
        }
    }
}
