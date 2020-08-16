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
    }
}

class A_Child extends A_Parent{

}

class A_Parent {

}