package remind.instanceOf;

public class InstanceOf2 {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        GrandParent gp = new GrandParent();

        if (c instanceof GrandParent) {
            System.out.println("hello grandmother ~");
        }

        if (c instanceof Parent) {
            System.out.println("hello mother ~");
        }

        if (p instanceof GrandParent) {
            System.out.println("hello mother~ ");
        }

        if (gp instanceof Child) {
            System.out.println("hello my grandson");
        }

        if (gp instanceof Parent) {
            System.out.println("hello my son");
        }

        if (p instanceof Child) {
            System.out.println("hello my son");
        }

        if (c instanceof Child) {
            System.out.println("Im child");
        }

        if (p instanceof Parent) {
            System.out.println("Im parent");
        }

        if (gp instanceof GrandParent) {
            System.out.println("Im grandparent");
        }
    }
}

interface Gretting {
    void hello();
    void handShake();
}


class Parent extends GrandParent {

}

class Child extends Parent implements Gretting {

    @Override
    public void hello() {
        System.out.println("Fuck u");
    }
}

class GrandParent implements Gretting {

    @Override
    public void hello() {
        System.out.println("hello~");
    }

    @Override
    public void handShake() {
        System.out.println("shall we handshake?");
    }
}