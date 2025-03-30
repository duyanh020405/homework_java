package bt9;

import java.io.*;
import java.util.*;

class BookManager {
    private final String file = "books.dat";
    private List<Book> books = new ArrayList<>();

    public BookManager() { loadBooks(); }

    private void loadBooks() {
        try (var ois = new ObjectInputStream(new FileInputStream(file))) {
            books = (List<Book>) ois.readObject();
        } catch (Exception e) {
            books = new ArrayList<>(); // Nếu file chưa có, tạo danh sách mới
        }
    }

    private void saveBooks() {
        try (var oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(books);
        } catch (Exception ignored) {}
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    public void updateBook(Book book) {
        books.stream().filter(b -> b.id == book.id).findFirst().ifPresent(b -> {
            b.name = book.name;
            b.author = book.author;
            b.price = book.price;
            saveBooks();
        });
    }

    public void deleteBook(int id) {
        if (books.removeIf(b -> b.id == id)) saveBooks();
    }

    public void displayAllBooks() {
        books.forEach(System.out::println);
    }
}
