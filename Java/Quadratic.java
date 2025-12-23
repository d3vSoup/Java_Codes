package Java;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double D = b*b - 4*a*c;
        if(D > 0){
            double r1 = (-b + Math.sqrt(D)) / (2*a);
            double r2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else if(D == 0){
            double r = -b / (2*a);
            System.out.println("Roots are real and same.");
            System.out.println("Root: " + r);
        } else {
            double realPart = -b / (2*a);
            double imagPart = Math.sqrt(-D) / (2*a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imagPart + "i");
        }
        sc.close();
    }
}
