package remind.interfaceRemind.ex3;

// interface 를 이용해 A 클래스와 B 클래스를 연결

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}

interface ClassConnect {
    void methodB();
}

class A {
    void methodA(ClassConnect cc) {
        cc.methodB();
    }
}

class B implements ClassConnect {

    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }
}