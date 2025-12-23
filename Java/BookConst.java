package Java;
//import java.util.*;

@SuppressWarnings("ALL")
public class BookConst {
    String title;
    String author;
    double price;

    BookConst() {
        title = "Empty";
        author = "Empty";
        price = 0.0;
    }

    BookConst(String title, String author) {
        this.title = title;
        this.author = author;
        price = 0.0;
    }

    BookConst(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }

    public static void main(String[] args) {
        BookConst b1 = new BookConst();
        BookConst b2 = new BookConst("Clean Code", "Robert C. Martin");
        BookConst b3 = new BookConst("Effective Java", "Joshua Bloch", 550.0);

        b1.display();
        b2.display();
        b3.display();
    }
}
