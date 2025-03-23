package ss17_htk01_1.src.hkt_01.validate;

import java.util.Scanner;

public class Major {
    public String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = isValidMajor(major) ? major : null;
    }
    public Major(Scanner sc) {
        System.out.println("Nhap nganh hoc :");
        setMajor(sc.nextLine());
    }
    public boolean isValidMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
