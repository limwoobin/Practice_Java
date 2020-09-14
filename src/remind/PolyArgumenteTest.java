package remind;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Audio extends Product {
    Audio() {
        super(100);
    }

    public String toString() {
        return "Audio";
    }
}

class Computer extends Product {
    Computer() {
        super(250);
    }

    public String toString() {
        return "Computer";
    }
}

class Burner extends Product {
    Burner() {
        super(80);
    }

    public String toString() {
        return "Burner";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;

        System.out.println(p + "구입");
    }
}

public class PolyArgumenteTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Audio());

        System.out.println(b.money);
        System.out.println(b.bonusPoint);
    }
}
