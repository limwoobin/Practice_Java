package ch07;

import java.util.Vector;

class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }

    Product3() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv3 extends Product3 {
    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv3";
    }
}

class Computer3 extends Product3 {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer3";
    }
}

class Audio3 extends Product3 {
    Audio3() {
        super(50);
    }

    public String toString() {
        return "Audio3";
    }
}

class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product3 p3) {
        if (money < p3.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p3.price;
        bonusPoint += p3.bonusPoint;
        item.add(p3);
        System.out.println(p3 + "구입");
    }

    void refund(Product3 p3) {
        if (item.remove(p3)) {
            money += p3.price;
            bonusPoint -= p3.bonusPoint;
            System.out.println(p3 + "반품");
        } else {
            System.out.println("구입한 제품중 해당 제품은 없음.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입한 제품 없음.");
            return;
        }

        for (int i=0; i<item.size(); i++) {
            Product3 p3 = (Product3) item.get(i);
            sum += p3.price;
            itemList += (i==0) ? "" + p3 : "," + p3;
        }
        System.out.println("구입한 총 금액:" + sum);
        System.out.println("구입한 제품은 " + itemList);
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv3 tv3 = new Tv3();
        Computer3 computer3 = new Computer3();
        Audio3 audio3 = new Audio3();

        b.buy(tv3);
        b.buy(computer3);
        b.buy(audio3);
        b.summary();
        System.out.println();
        b.refund(computer3);
        b.summary();
    }
}
