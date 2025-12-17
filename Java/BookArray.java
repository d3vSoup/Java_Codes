package Java;
import java.util.*;
//@SuppressWarnings("unused")

class Book{
    private String name;
    private String author;
    private double price;
    private int num;
    Book(String name, String author, double price, int num){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num = num;
    }
    void setName(String name){
        this.name = name;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setNum(int num){
        this.num = num;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
    int getNum(){
        return num;
    }
}
public class BookArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine(); // Consume the newline character
        Book[] books = new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter book " + (i+1) + " details (name author price num):");
            String name = sc.nextLine();
            System.out.println("Enter author " + (i+1) + " details (name author price num):");
            String author = sc.nextLine();
            System.out.println("Enter price " + (i+1) + " details (name author price num):");
            double price = sc.nextDouble();
            System.out.println("Enter number of copies " + (i+1) + " details (name author price num):");
            int num = sc.nextInt();
            books[i] = new Book(name, author, price, num);
    }
    for(int i=0;i<n;i++){
        System.out.println(books[i].getName() + " " + books[i].getAuthor() + " " + books[i].getPrice() + " " + books[i].getNum());
    }
    sc.close();
}
}
