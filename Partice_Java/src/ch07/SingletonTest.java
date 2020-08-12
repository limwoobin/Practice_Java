package ch07;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) {
            return new Singleton();
        }
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
    }
}
