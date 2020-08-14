package ch07;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price/10.0);
//        bonusPoint = (int) (price/10.0);
    }
}

class PTv extends Product {
    PTv() {
        super(100);
    }

    public String toString() {
        return "PTv";
    }
}

class PComputer extends Product {
    PComputer() {
        super(200);
    }

    public String toString() {
        return "PComputer";
    }
}

class Buyer {
    int money = 100;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "구입!");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new PTv());
        b.buy(new PComputer());

        System.out.println("남은돈:" + b.money);
        System.out.println("보너스포인트:" + b.bonusPoint);

    }
}
