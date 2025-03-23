package ss17_htk01_1.src.ra.presentation.validate;

import java.util.Scanner;

public class Student_id {
    private String id;

    public Student_id(Scanner sc) {
        System.out.println("Nhap id sinh vien :");
        String id = sc.nextLine();
        if (isValidId(id)) {
            this.id = id;
        } else {
            this.id = null;
        }
    }

    private boolean isValidId(String id) {
        if (id == null || id.length() != 7) {
            return false;
        }
        if (!id.startsWith("SV")) {
            return false;
        }
        for (int i = 2; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public String getId() {
        return id;
    }
}
