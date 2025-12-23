package Java;

class Container<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class TestContainer {
    public static void main(String[] args) {
        Container<String> c1 = new Container<>();
        c1.set("Hello");
        System.out.println(c1.get());

        Container<Double> c2 = new Container<>();
        c2.set(99.9);
        System.out.println(c2.get());
    }
}

