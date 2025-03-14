package ss10.src;

public class Book {
   private String title;
   private String author;
   private int price ;
   public Book(String title, String author, int price) {
       this.title = title;
       this.author = author;
       this.price = price;
   }

    public String getTitle() {
        System.out.println("Title: " + title);
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        System.out.println("Author: " + author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        System.out.println("price is " + price);
        return price;

    }

    public void setPrice(int price) {
        this.price = price;
    }
}
