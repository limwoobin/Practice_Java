package remind.interfaceRemind;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f 는 Unit 의 자손");
        }

        if (f instanceof Fightable) {
            System.out.println("f는 Fightable 인터페이스를 구현");
        }

        if (f instanceof Movable) {
            System.out.println("f는 Movable 인터페이스를 구현");
        }

        if (f instanceof Attackable) {
            System.out.println("f는 Attackable 인터페이스를 구현");
        }

        if (f instanceof Object) {
            System.out.println("f 는 Object 의 자손");
        }
    }
}

class Fighter extends Unit implements Fightable {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable , Attackable {

}

interface Movable {
    void move(int x , int y);
}

interface Attackable {
    void attack(Unit u);
}