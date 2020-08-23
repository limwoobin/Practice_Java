package ch12;

import java.util.ArrayList;

class Fruit3 {
    public String toString() {
        return "Fruit3";
    }
}

class Apple3 extends Fruit3 {
    public String toString() {
        return "Apple3";
    }
}

class Grape3 extends Fruit3 {
    public String toString() {
        return "Grape3";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Juicer {
//    static Juice makeJuice(FruitBox3<? extends Fruit3> box3) {
//        String tmp = "";
//
//        for (Fruit3 f3 : box3.getList()) {
//            tmp += f3 + " ";
//        }
//        return new Juice(tmp);
//    }
    static <T extends Fruit3> Juice makeJuice(FruitBox3<T> box3) {
        String tmp = "";

        for (Fruit3 f3 : box3.getList()) {
            tmp += f3 + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox3 = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> appleBox3 = new FruitBox3<Apple3>();

        fruitBox3.add(new Apple3());
        fruitBox3.add(new Grape3());
        appleBox3.add(new Apple3());
        appleBox3.add(new Apple3());

        System.out.println(Juicer.makeJuice(fruitBox3));
        System.out.println(Juicer.makeJuice(appleBox3));
    }
}

class FruitBox3<T extends Fruit3> extends Box3<T> {

}

class Box3<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    ArrayList<T> getList() {
        return list;
    }
    public String toString() {
        return list.toString();
    }
}