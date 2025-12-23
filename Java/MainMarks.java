package Java;
import CIE.*;
import SEE.*;
import java.util.*;
public class MainMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            Student s = new Student();
            Internals in = new Internals();
            External ex = new External();

            System.out.print("\nEnter USN: ");
            s.usn = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter Name: ");
            s.name = sc.nextLine();
            System.out.print("Enter sem: ");
            s.sem = sc.nextInt();
            System.out.println("Enter Internals marks for 5 subjects:");
            for(int j = 0; j < 5; j++)
                in.marks[j] = sc.nextInt();
            System.out.println("Enter External marks for 5 subjects:");
            for(int j = 0; j < 5; j++)
                ex.marks[j] = sc.nextInt();
            System.out.println("Final Marks:");
            for(int j = 0; j < 5; j++)
                System.out.println("Subject " + (j+1) + ": " +
                        (in.marks[j] + ex.marks[j]));
        }

        sc.close();
    }
}