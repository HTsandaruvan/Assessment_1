package classAndObject;


public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price (USD): " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Java", "Elon Musk", 32);
        book.displayBookInfo();
    }
}
