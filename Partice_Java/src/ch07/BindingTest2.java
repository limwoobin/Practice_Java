package ch07;

public class BindingTest2 {
    public static void main(String[] args) {
        Bind_Parent2 bp = new Bind_Child2();
        Bind_Child2 bc = new Bind_Child2();

        System.out.println("bp.x=" + bp.x);
        bp.method();

        System.out.println("bc.x=" + bc.x);
        bc.method();
    }
}

class Bind_Parent2 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Bind_Child2 extends Bind_Parent2 {

}