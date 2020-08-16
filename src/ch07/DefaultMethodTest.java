package ch07;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Dchild dchild = new Dchild();
        dchild.method1();
        dchild.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Dchild extends Dparent implements MyInterface , MyInterface2 {

    @Override
    public void method1() {
        System.out.println("method1() in Child");
    }
}

class Dparent {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}