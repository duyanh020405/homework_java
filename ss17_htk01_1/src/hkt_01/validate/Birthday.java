package ss17_htk01_1.src.hkt_01.validate;

import java.util.Scanner;

public class Birthday {
    private String birthday;

    public String getBirthday() {
        return birthday;
    }



    public Birthday(Scanner sc) {
        System.out.print("Nhập ngày sinh (YYYY-MM-DD): ");
        setBirthday(sc.nextLine());
        if (birthday == null) System.out.println("Ngày sinh không hợp lệ!");
    }
    public void setBirthday(String birthday) {
        this.birthday = isValidDate(birthday) ? birthday : null;
    }
    private boolean isValidDate(String date) {
        return date != null && date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
}
