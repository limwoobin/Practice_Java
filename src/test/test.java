package test;

import java.util.HashMap;
import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        System.out.println(Kind.CLOVER);
        System.out.println(Kind.CLOVER. name());
        System.out.println(Kind.CLOVER.getText());

        Child child = new Child();
        Parent parent = child; // 업캐스팅 - 생략가능
        Child child2 = (Child) parent; // 다운캐스팅 - 생략불가능

        child2.getChild();
        child2.getParent(); // 자식은 부모의 요소 접근가능

        parent.getParent();
//        parent.getChild();  부모는 본인or부모의 요소에만 접근가능
    }
}

enum Kind {

    CLOVER("CLOVER");

    private String text;

    Kind(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

abstract class TTT {
    abstract void hi();
}

class Parent {
    public void getParent() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    public void getChild() {
        System.out.println("child");
    }
}