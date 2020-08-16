package ch07;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.methodA();
    }
}

class A3 {
    void methodA() {
        I3 i3 = InstanceManager.getInstance();
        i3.methodB();
        System.out.println(i3.toString());
    }
}

interface I3 {
    void methodB();
}

class B3 implements I3 {

    @Override
    public void methodB() {
        System.out.println("methodB in B3 Class");
    }

    public String toString() {
        return "B3";
    }
}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}