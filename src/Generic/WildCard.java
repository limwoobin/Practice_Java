package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        Parent mother = new Parent("mother");
        Parent father = new Parent("father");
        Child brother = new Child("brother");
        Child me = new Child("me");

        List<Parent> parents = new ArrayList<>();
        parents.add(mother);
        parents.add(father);
        entranceTest(parents);

        List<Child> children = new ArrayList<>();
        children.add(brother);
        children.add(me);
        entranceTest(children);
    }

    private static void entranceTest(List<? extends Parent> humanList) {
        Iterator iterator = humanList.iterator();
        while (iterator.hasNext()) {
            Parent man = (Parent) iterator.next();
            System.out.println(man.identify + "is enable entrace");
        }
    }
}


class Parent {
    String identify;

    protected Parent(String identify) {
        this.identify = identify;
    }
}

class Child extends Parent {

    protected Child(String identify) {
        super(identify);
    }
}