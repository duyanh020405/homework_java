import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KS23B_Java_OOP_Practice {
    static class Book {
        String bookId;
        String BookName;
        int importPrice;
        int exportPrice;
        String title;
        String author;
        int interest;
        int year;

        public Book(String bookId, String BookName, int importPrice, int exportPrice, String title, String author, int interest, int year) {
            this.bookId = bookId;
            this.BookName = BookName;
            this.importPrice = importPrice;
            this.exportPrice = exportPrice;
            this.title = title;
            this.author = author;
            this.interest = interest;
            this.year = year;
        }

        public void display(String id) {
            if (this.bookId.equals(id)) {
                System.out.println("1.Book Id : " + bookId);
                System.out.println("2.Book Name : " + BookName);
                System.out.println("3.Import Price : " + importPrice);
                System.out.println("4.Export Price : " + exportPrice);
                System.out.println("5.Title : " + title);
                System.out.println("6.Author : " + author);
                System.out.println("7.Interest : " + interest);
                System.out.println("8.Year : " + year);
            } else {
                System.out.println("Không có sách nào như vậy cả ");
            }
        }

        public void setInforBook(String id) {
            boolean set = true;
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("******Menu******* \n Chọn phần để sửa ");
                System.out.println("1. Book Name : ");
                System.out.println("2. Import Price : ");
                System.out.println("3. Export Price : ");
                System.out.println("4. Title : ");
                System.out.println("5. Author : ");
                System.out.println("6. Interest : ");
                System.out.println("7. Year : ");
                System.out.println("8.Thoát");
                System.out.println("Chọn đi");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên moi");
                        String BookName = sc.next();
                        if (BookName.length() >= 6 && BookName.length() <= 100 && BookName.charAt(0) == 'B') {
                            this.BookName = BookName;
                            System.out.println("Đã cập nhaatj thành công");
                            break;
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 2:

                        System.out.println("Nhập giá nhập mới");
                        int importPrice = sc.nextInt();
                        if (importPrice > 0 && importPrice + importPrice * 1.1 < this.exportPrice) {
                            this.importPrice = importPrice;
                            System.out.println("Đã cập nhaatj thành công");
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 3:
                        importPrice = this.importPrice;
                        System.out.println("Nhập giá nhập mới");
                        int exportPrice = sc.nextInt();
                        if (exportPrice > importPrice + importPrice * 0.1) {
                            this.importPrice = importPrice;
                            System.out.println("Đã cập nhaatj thành công");
                            break;
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 4:
                        this.exportPrice = this.exportPrice - this.importPrice;
                        System.out.println("Đã cập nhaatj thành công");
                    case 5:
                        System.out.println("Nhập title mới");
                        String title = sc.next();
                        if (!title.isEmpty()) {
                            this.title = title;
                            System.out.println("Đã cập nhaatj thành công");
                            break;
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 6:
                        System.out.println("Nhập author mới");
                        String author = sc.next();
                        if (!author.isEmpty()) {
                            this.author = author;
                            System.out.println("Đã cập nhaatj thành công");
                            break;
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 7:
                        System.out.println("Nhập năm chỉnh sửa");
                        int year = sc.nextInt();
                        if (year > 1970) {
                            this.year = year;
                            System.out.println("Đã cập nhaatj thành công");
                            break;
                        } else {
                            System.out.println("Nhập không đúng , vui lòng thử lại");
                        }
                        break;
                    case 8:
                        set = false;
                        break;
                }
            } while (set == true);

        }

        class Infor {
            String author;
            ArrayList<Book> books;

            public Infor(String author) {
                this.author = author;
                this.books = new ArrayList<>();
            }

            public void addBook(Book book) {
                books.add(book);
            }
        }

        public class BookStatistics {
            public void statisticsByAuthor(Book[] arr, int index) {
                ArrayList<Infor> authorList = new ArrayList<>();

                for (int i = 0; i < index; i++) {
                    Book book = arr[i];
                    boolean found = false;

                    for (Infor infor : authorList) {
                        if (infor.author.equals(book.author)) {
                            infor.addBook(book);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        Infor newInfor = new Infor(book.author);
                        newInfor.addBook(book);
                        authorList.add(newInfor);
                    }
                }

                for (Infor infor : authorList) {
                    System.out.println("Tác giả: " + infor.author);
                    for (Book book : infor.books) {
                        System.out.println("  - " + book.title);
                    }
                }
            }


        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int index = 0;
            Book[] arr = new Book[100];
            boolean flag = true;
            do {
                System.out.println("****************************MENU************************* \n" +
                        "1. Danh sách sách\n" +
                        "2. Thêm mới sách\n" +
                        "3. Tính lợi nhuận của các sách\n" +
                        "4. Cập nhật sách\n" +
                        "5. Xóa sách\n" +
                        "6. Sắp xếp sách theo lợi nhuận tăng dần\n" +
                        "7. Tìm kiếm sách theo tác giả\n" +
                        "8. Tìm kiếm sách theo khoảng giá (tìm theo khoảng giá bán)\n" +
                        "9. Thống kê sách theo mỗi tác giả\n" +
                        "10.Thoát");
                int choice = sc.nextInt();
                if (choice >= 1 && choice <= 10) {
                    switch (choice) {
                        case 1:
                            for (int i = 0; i < index; i++) {
                                arr[i].display(arr[i].bookId);
                            }
                            break;
                        case 2:
                            System.out.println("Nhập mã sách");
                            String bookId = sc.next();
                            for (int i = 0; i < arr.length; i++) {
                                char c = bookId.charAt(0);
                                if (c == 'B' && bookId.length() >= 5) {
                                    System.out.println("Nhập tên sách (bookName) là chuỗi gồm 6-100 ký tự");
                                    String bookName = sc.next();
                                    if (bookName.length() >= 6 && bookName.length() <= 100) {
                                        System.out.println("Nhập giá nhập");
                                        int importPrice = sc.nextInt();
                                        if (importPrice > 0) {
                                            System.out.println("Nhập giá bán");
                                            int exportPrice = sc.nextInt();
                                            sc.nextLine();
                                            if (exportPrice + exportPrice * 0.1 > importPrice) {
                                                System.out.println("Tiêu đề sách :");
                                                String title = sc.next();
                                                if (!title.isEmpty()) {
                                                    System.out.println("Nhập tác giả ");
                                                    String author = sc.next();
                                                    if (!author.isEmpty()) {
                                                        int interest = exportPrice - importPrice;
                                                        System.out.println("Nhập năm xuất bản :");
                                                        int year = sc.nextInt();
                                                        if (year > 1970) {
                                                            Book new_Book = new Book(bookId, bookName, importPrice, exportPrice, title, author, interest, year);
                                                            arr[index] = new_Book;
                                                            index++;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("Không đúng yêu cầu , vui lòng thử lại");
                                    }

                                }
                            }
                            break;
                        case 3:
                            int sum = 0;
                            for (int i = 0; i < index; i++) {
                                sum += arr[i].interest;
                            }
                            System.out.println("Tổng lợi nhuận tất cả các sách :" + sum);
                            break;
                        case 4:
                            System.out.println("Nhập id muốn chỉnh sửa :");
                            String id = sc.next();
                            for (int i = 0; i < index; i++) {
                                if (id.equals(arr[i].bookId)) {
                                    arr[i].setInforBook(id);
                                    break;
                                } else {
                                    System.out.println("Không có id nào như vậy , thử lại đi");
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Nhập id sách muốn xóa: ");
                            String delete_bookId = sc.next();
                            int newSize = 0;

                            Book[] newArr = new Book[arr.length];
                            for (int i = 0; i < index; i++) {
                                if (!arr[i].bookId.equals(delete_bookId)) {
                                    newArr[newSize++] = arr[i];
                                }
                            }
                            arr = Arrays.copyOf(newArr, newSize);
                            System.out.println("Đã xóa thành công.");
                            break;
                        case 6:
                            for (int i = 0; i < index; i++) {
                                for (int j = i + 1; j < index; j++) {
                                    if (arr[i].interest > arr[j].interest) {
                                        Book temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                                }
                            }
                            System.out.println("Đã sắp sếp thành công");
                            break;
                        case 7:
                            int count = 0;
                            System.out.println("Nhập tên tác giả muốn tìm từ sách");
                            String find_name = sc.next();
                            for (int i = 0; i < index; i++) {
                                if (arr[i].author.equalsIgnoreCase(find_name)) {
                                    System.out.println(arr[i].BookName);
                                    count++;
                                }
                            }
                            if (count == 0) {
                                System.out.println("Không có tác giả này");
                                break;
                            }
                            break;
                        case 8:
                            int from = 0;
                            int to = 0;
                            System.out.println("Mhập giá from :");
                            from = sc.nextInt();
                            System.out.println("Nhập giá to :");
                            to = sc.nextInt();
                            if (from > 0 && to > from) {
                                for (int i = 0; i < index; i++) {
                                    if (arr[i].exportPrice >= from && arr[i].exportPrice <= to) {
                                        System.out.println(arr[i].BookName);
                                    }
                                }
                            }
                            break;
                        case 9:
                            statisticsByAuthor(arr,index);
                            break;


                    }
                } else {
                    System.out.println("Nhập lại");
                }

            }
            while (flag == true);

        }
        private static void statisticsByAuthor(Book[] arr, int index) {
        }
    }
}
