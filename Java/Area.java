package Java;
import java.util.*;
@SuppressWarnings("unused")
abstract class Shape{
    int a,b;
    abstract void printarea();
}

class Rectangle extends Shape{
    Rectangle(int x, int y){
        a = x;
        b = y;
    }
    @Override
    void printarea(){
        System.out.println("Area of Rectangle: " + (a*b));
    }
}

class Triangle extends Shape{
    Triangle(int x, int y){
        a = x;
        b = y;
    }
    @Override
    void printarea(){
        System.out.println("Area of Triangle: " + (0.5*a*b));
    }
}

class Circle extends Shape{
    Circle(int r){
        a = r;
    }
    @Override
    void printarea(){
        System.out.println("Area of Circle: " + (3.14*a*a));
    }
}

public class Area {
    public static void main(String args[]){
        Shape s;
        s = new Rectangle(10, 20);
        s.printarea();
        s = new Triangle(10, 20);
        s.printarea();
        s = new Circle(10);
        s.printarea();
    }
}
