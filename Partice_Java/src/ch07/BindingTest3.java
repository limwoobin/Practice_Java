package ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Bind_Parent3 p = new Bind_Child3();
        Bind_Child3 c = new Bind_Child3();

        System.out.println("p.x=" + p.x);
        p.method();

        System.out.println("c.x=" + c.x);
        c.method();
    }
}


class Bind_Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent method");
    }
}

class Bind_Child3 extends Bind_Parent3 {
    int x = 200;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}