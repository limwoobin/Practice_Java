package remind;

final class Singleton {
    private static Singleton s = new Singleton();

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }

        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
//        System.out.println(s);
    }
}
