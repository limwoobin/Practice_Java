package ch07;

class FinalCard {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    FinalCard(String kind , int num) {
        KIND = kind;
        NUMBER = num;
    }

    FinalCard() {
        this("HEART" , 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        FinalCard fc = new FinalCard("HEART" , 10);
        System.out.println(fc.KIND);
        System.out.println(fc.NUMBER);
        System.out.println(fc);
        System.out.println(new FinalCard());
    }
}
