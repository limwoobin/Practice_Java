package ch07;

interface I {
    void play();
}

class A2 {
    void autoPlay(I i) {
        i.play();
    }
}

class B2 implements I{

    @Override
    public void play() {
        System.out.println("play in B2 Class");
    }
}

class C2 implements I {

    @Override
    public void play() {
        System.out.println("play in C2 Class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.autoPlay(new B2());
        a2.autoPlay(new C2());
    }
}
