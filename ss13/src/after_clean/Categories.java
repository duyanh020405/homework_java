package bt;

import java.util.Scanner;

public class Categories {
    private static int idCounter = 0;
    private int category_id;
    private String category_name;
    private String describe;
    private boolean status;

    public Categories(String categoryName, String describe, boolean status) {
        this.category_id = ++idCounter;
        this.category_name = categoryName;
        this.describe = describe;
        this.status = status;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getDescribe() {
        return describe;
    }

    public boolean isStatus() {
        return status;
    }

    public void setCategory_name(String name) {
        this.category_name = name;
    }

    public void setDescribe(String desc) {
        this.describe = desc;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static Categories inputData(Scanner scanner) {
        scanner.nextLine();

        System.out.print("Enter Category Name: ");
        String category_name = scanner.nextLine().trim();

        System.out.print("Enter Description: ");
        String describe = scanner.nextLine().trim();
        if (category_name.length() > 6 && category_name.length() < 50
                && !describe.isEmpty() && describe.length() < 255) {
            System.out.println("Thành công!");
            return new Categories(category_name, describe, true);
        } else {
            System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại!");
            return null;
        }
    }
    public void display() {
        System.out.println("Id: " + category_id + " - " + category_name);
    }
}