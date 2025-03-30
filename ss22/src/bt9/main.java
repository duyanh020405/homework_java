package bt9;

public class main {
    public static void main(String[] args) {
        BookManager bm = new BookManager();
        bm.addBook(new Book(1, "Java", "James Gosling", "Sun", 300.0));
        bm.addBook(new Book(2, "C++", "Bjarne Stroustrup", "AT&T", 250.0));
        bm.displayAllBooks();
        bm.updateBook(new Book(1, "Java Advanced", "James Gosling", "Sun", 350.0));
        bm.deleteBook(2);
        bm.displayAllBooks();
    }
}
