package finalTest;

public class Test {
    public static void main(String[] args) {
        Vo v = new Vo();
        v.setA(5);
        System.out.println(v.getA());
        System.out.println(v.getB());
    }
}

class Vo {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
