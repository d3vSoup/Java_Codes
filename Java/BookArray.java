package Java;
import java.util.*;

class Book {
    private String name;
    private String author;
    private double price;
    private int num_pages;

    Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getNumPages() {
        return num_pages;
    }

    public String toString() {
        return "Name: " + name +
               ", Author: " + author +
               ", Price: " + price +
               ", Pages: " + num_pages;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            String name = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            int pages = sc.nextInt();
            sc.nextLine();

            books[i] = new Book(name, author, price, pages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(books[i]);
        }

        sc.close();
    }
}
