package ss17.src;

import java.util.*;

class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{id='" + id + "', title='" + title + "', author='" + author + "', year=" + year + "}";
    }
}

class Library {
    private Set<Book> bookSet;

    public Library() {
        this.bookSet = new HashSet<>();
    }

    public boolean addBook(Book book) {
        return bookSet.add(book);
    }

    public List<Book> filterBooksByYear(int minYear) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : bookSet) {
            if (book.getYear() > minYear) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public List<Book> sortBooksByTitle(List<Book> bookList) {
        bookList.sort(Comparator.comparing(Book::getTitle));
        return bookList;
    }

    public void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class bt9 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("B01", "JRonaldo", "John Doe", 2020));
        library.addBook(new Book("B02", "Messi", "Jane Smith", 2018));
        library.addBook(new Book("B03", "Mpape", "Alice Brown", 2021));
        library.addBook(new Book("B04", "Robetor calos", "Bob White", 2019));
        library.addBook(new Book("B05", "David Luis", "Charlie Green", 2022));

        List<Book> filteredBooks = library.filterBooksByYear(2019);
        List<Book> sortedBooks = library.sortBooksByTitle(filteredBooks);
        System.out.println("Danh sách sách xuất bản sau năm 2019, sắp xếp theo tên:");
        library.printBooks(sortedBooks);
    }
}

