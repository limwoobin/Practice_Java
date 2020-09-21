package remind.interfaceRemind.ex2;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();

        System.out.println(tank.hitPoint);
        System.out.println(dropship.hitPoint);
        System.out.println(marine.hitPoint);

        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair((Repairable) marine);
    }
}

interface Repairable {

}

class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    AirUnit(int hp) {
        super(hp);
    }
}

class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit(int hp) {
        this.MAX_HP = hp;
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
    }

    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }

            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}