package ch07;

public class InstanceofTest2 {
    public static void main(String[] args) {
        A_Child a_child = new A_Child();
        A_Parent a_parent = new A_Parent();

        System.out.println(a_child instanceof A_Child);
        System.out.println(a_parent instanceof A_Parent);

        System.out.println(a_child instanceof A_Parent);
        System.out.println(a_parent instanceof A_Child);

        System.out.println(a_parent instanceof Object);

        Object obj = new Object();
        System.out.println(obj instanceof A_Parent);

        InstanceTest instanceTest = new InstanceTest();
        instanceTest.equalsTest(new InstanceTest());
    }
}

class A_Child extends A_Parent{

}

class A_Parent {

}

class InstanceTest {

    public void equalsTest(Object obj) {
        if (obj instanceof InstanceTest) {
            System.out.println("true??");
        } else {
            System.out.println("false??");
        }
    }
}