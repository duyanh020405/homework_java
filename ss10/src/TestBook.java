package ss10.src;

public class TestBook extends Book {
    public TestBook(String title, String author, int price) {
        super(title, author, price);
    }

    public static void main(String[] args) {
        Book book = new Book("Toyota", "BMW", 2016);
        Book book2 = new Book("Yamaha", "BTX", 2016);
        book2.setTitle("Da co su thay doi");
        book.getTitle();
        book.getAuthor();
        book.getPrice();
        book2.getTitle();
        book2.getAuthor();
        book2.getPrice();
    }

}

