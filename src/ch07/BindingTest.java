package ch07;

public class BindingTest {
    public static void main(String[] args) {
        Bind_Parent bp = new Bind_Child();
        Bind_Child bc = new Bind_Child();

        System.out.println("bp.x=" + bp.x);
        bp.method();

        System.out.println("bc.x=" + bc.x);
        bc.method();
    }
}

class Bind_Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Bind_Child extends Bind_Parent {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}