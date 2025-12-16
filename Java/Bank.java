package Java;
import java.util.*;
//@SuppressWarnings("unused")
class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        accType = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully");
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

// Savings Account
class SavAcct extends Account {

    void computeInterest() {
        double interest = balance * 0.05;   // 5% interest
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Current Account
class CurAcct extends Account {
    double minBalance = 1000;
    double penalty = 100;

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;

            if (balance < minBalance) {
                balance -= penalty;
                System.out.println("Minimum balance not maintained");
                System.out.println("Penalty imposed: " + penalty);
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavAcct s = new SavAcct();
            s.acceptDetails();

            System.out.print("Enter deposit amount: ");
            s.deposit(sc.nextDouble());

            s.computeInterest();

            System.out.print("Enter withdrawal amount: ");
            s.withdraw(sc.nextDouble());

            s.displayBalance();
        }
        else if (choice == 2) {
            CurAcct c = new CurAcct();
            c.acceptDetails();

            System.out.print("Enter deposit amount: ");
            c.deposit(sc.nextDouble());

            System.out.print("Enter withdrawal amount: ");
            c.withdraw(sc.nextDouble());

            c.displayBalance();
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}