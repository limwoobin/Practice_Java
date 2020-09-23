package remind.instanceOf;

public class InsatanceOfTest {
    public static void main(String[] args) {
        FireEngine2 fe2 = new FireEngine2();
        Car2 car2 = new Car2();
        if (fe2 instanceof FireEngine2) {
            System.out.println("FireEngine2 Instance.");
        }

        if (fe2 instanceof Car2) {
            System.out.println("Car2 Instance.");
        }

        if (car2 instanceof Car2) {
            System.out.println("Car2 Instance.");
        }

        if (car2 instanceof FireEngine2) {
            System.out.println("FireEngine2 Instance.");
        }
    }
}


class Car2 {}
class FireEngine2 extends Car2 {}