package Java;
import java.util.*;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    void getDetails(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Account No: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Type: ");
        accType = sc.nextLine();
        System.out.print("Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amt) {
        balance += amt;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    void computeInterest() {
        balance = balance * Math.pow(1.05, 1);   // compound interest
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }
}

class CurAcct extends Account {
    double minBal = 1000;
    double penalty = 100;

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            if (balance < minBal){
                balance -= penalty;
                System.out.println("Penalty imposed due to low balance");
            }
        }
    }

    void chequeBook() {
        System.out.println("Cheque book facility available");
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            SavAcct s = new SavAcct();
            s.getDetails(sc);
            s.deposit(500);
            s.computeInterest();
            s.withdraw(300);
            s.displayBalance();
        } else {
            CurAcct c = new CurAcct();
            c.getDetails(sc);
            c.deposit(500);
            c.withdraw(300);
            c.chequeBook();
            c.displayBalance();
        }

        sc.close();
    }
}
