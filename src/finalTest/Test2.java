package finalTest;

public class Test2 {
    public static void main(String[] args) {
        Vo2 v = new Vo2(5 , 3);
        System.out.println(v.getA());
        System.out.println(v.getB());

    }
}

class Vo2 {
    public Vo2(int a , int b) {
        this.a = a;
        this.b = b;
    }

    private final int a;
    private final int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
