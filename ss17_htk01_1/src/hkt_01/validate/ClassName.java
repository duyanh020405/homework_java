package ss17_htk01_1.src.hkt_01.validate;

import java.util.Scanner;

public class ClassName {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = isClassNameinvalidate(name) ? name : null;
    }
    public ClassName(Scanner sc) {
        System.out.print("Nhập tên lớp: ");
        setName(sc.nextLine());
    }
    public boolean isClassNameinvalidate(String name) {
        if (name.trim().isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }
}
