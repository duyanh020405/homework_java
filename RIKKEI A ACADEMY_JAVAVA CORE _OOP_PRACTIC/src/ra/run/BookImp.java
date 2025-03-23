package ra.run;

import ra.entity.Book;
import java.util.*;
import java.util.stream.Collectors;

public class BookImp {
    private static List<Book> bookList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n*********************MENU******************");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    calculateInterest();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    sortBooksByPrice();
                    break;
                case 5:
                    sortBooksByInterest();
                    break;
                case 6:
                    searchBookByName();
                    break;
                case 7:
                    countBooksByYear();
                    break;
                case 8:
                    countBooksByAuthor();
                    break;
                case 9:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void calculateInterest() {
    }

    private static void addBook() {
        System.out.print("Nhập số lượng sách: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Book book = new Book();
            book.inputData(scanner);
            bookList.add(book);
        }
    }

    private static void displayBooks() {
        for (Book book : bookList) {
            book.displayData();
        }
    }

    private static void sortBooksByPrice() {
        bookList.sort(Comparator.comparing(Book::getExportPrice));
        displayBooks();
    }

    private static void sortBooksByInterest() {
        bookList.sort((b1, b2) -> Float.compare(b2.getInterest(), b1.getInterest()));
        displayBooks();
    }

    private static void searchBookByName() {
        System.out.print("Nhập tên sách cần tìm: ");
        String name = scanner.nextLine();
        bookList.stream().filter(book -> book.getBookName().equalsIgnoreCase(name)).forEach(Book::displayData);
    }

    private static void countBooksByYear() {
        Map<Integer, Long> countMap = bookList.stream().collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));
        countMap.forEach((year, count) -> System.out.println("Năm " + year + ": " + count + " sách"));
    }

    private static void countBooksByAuthor() {
        Map<String, Long> countMap = bookList.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        countMap.forEach((author, count) -> System.out.println("Tác giả " + author + ": " + count + " sách"));
    }
}
