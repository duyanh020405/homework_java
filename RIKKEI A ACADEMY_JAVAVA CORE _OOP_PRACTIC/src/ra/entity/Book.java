package ra.entity;

import java.util.Scanner;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book() {}

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
        this.interest = exportPrice - importPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        if (importPrice > 0) {
            this.importPrice = importPrice;
        }
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        if (exportPrice >= importPrice * 1.3) {
            this.exportPrice = exportPrice;
            this.interest = exportPrice - importPrice;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() >= 6 && author.length() <= 50) {
            this.author = author;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2000) {
            this.year = year;
        }
    }

    public float getInterest() {
        return interest;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sách: ");
        this.bookId = scanner.nextLine();
        System.out.print("Nhập tên sách (bắt đầu bằng B): ");
        this.bookName = scanner.nextLine();
        System.out.print("Nhập giá nhập: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập giá xuất: ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập tác giả: ");
        this.author = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.year = Integer.parseInt(scanner.nextLine());
        this.interest = exportPrice - importPrice;
    }

    public void displayData() {
        System.out.println("Mã sách: " + bookId + ", Tên sách: " + bookName + ", Giá nhập: " + importPrice + ", Giá xuất: " + exportPrice + ", Lợi nhuận: " + interest + ", Tác giả: " + author + ", Năm XB: " + year);
    }
}
