package ch12;

import java.util.ArrayList;

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit2";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple2";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape2";
    }
}

class Toy2 extends Fruit2 {
    public String toString() {
        return "Toy2";
    }
}

interface Eatable {}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruitBox = new FruitBox<Fruit2>();
        FruitBox<Apple2> appleBox = new FruitBox<Apple2>();
        FruitBox<Grape2> grapeBox = new FruitBox<Grape2>();

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
//        appleBox.add(new Grape2());
        grapeBox.add(new Grape2());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
    }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box2<T> {

}

class Box2<T> {
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
    public String toString() {
        return list.toString();
    }
}
