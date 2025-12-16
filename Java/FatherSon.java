package Java;

import java.util.*;
//package Java;
@SuppressWarnings("unused")
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father{
    int fage;
    Father(int age) throws WrongAge{
        if(age < 0) throw new WrongAge ("Father's age cannot be negative");
        fage = age;
    }
}

class Son extends Father{
    int sage;
    Son(int fage, int sage) throws WrongAge{
        super(fage);
        if(sage < 0) throw new WrongAge ("Son's age cannot be negative");
        if(sage >= fage) throw new WrongAge ("Son's age must be less than Father's age");
        this.sage = sage;
    }
}

public class FatherSon {
    public static void main(String args[]){
        try{
            Father f = new Father(50);
            Son s = new Son(10, 20);
            System.out.println("Father's age: " + f.fage);
            System.out.println("Son's age: " + s.sage);
        }
        catch(WrongAge e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}