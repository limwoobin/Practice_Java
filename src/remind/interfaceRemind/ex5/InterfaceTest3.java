package remind.interfaceRemind.ex5;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}

class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I {
    void methodB();
}

class B implements I {

    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    @Override
    public String toString() {
        return "B Class";
    }
}

class InstanceManager {
    public static I getInstance() {
        return new B();
    }
}