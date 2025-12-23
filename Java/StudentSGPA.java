package Java;
import java.util.*;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }

    int gradePoint(int mark) {
        if (mark >= 90) return 10;
        else if (mark >= 80) return 9;
        else if (mark >= 70) return 8;
        else if (mark >= 60) return 7;
        else if (mark >= 50) return 6;
        else return 0;
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < n; i++) {
            int gp = gradePoint(marks[i]);
            weightedSum += credits[i] * gp;
            totalCredits += credits[i];
        }

        return (double) weightedSum / totalCredits;
    }

    void display() {
        System.out.println("\nUSN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("SGPA: " + calculateSGPA());
    }
}

public class StudentSGPA {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}
