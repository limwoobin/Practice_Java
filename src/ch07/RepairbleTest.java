package ch07;

public class RepairbleTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();

        Marine marine = new Marine();

        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
//        scv.repair(marine);
    }
}

interface Repairable {}

class GroundUnit extends AllUnit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends AllUnit {
    AirUnit(int hp) {
        super(hp);
    }
}

class AllUnit {
    int hitPoint;
    final int MAX_HP;
    AllUnit(int hp) {
        MAX_HP = hp;
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnit implements Repairable {
    DropShip() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof AllUnit) {
            AllUnit u = (AllUnit) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리 끝");
        }
    }
}