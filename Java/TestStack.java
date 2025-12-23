package Java;

import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> items = new ArrayList<>();

    void push(T item) {
        items.add(item);
    }

    T pop() {
        return items.remove(items.size() - 1);
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("A");
        s.push("B");

        System.out.println(s.pop()); // B
        System.out.println(s.pop()); // A
    }
}
