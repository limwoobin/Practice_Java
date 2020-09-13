package remind;

public class Casting {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;  // Up-Casting (형변환 생략가능)
//        car.water(); -> error
        fe2 = (FireEngine) car; // Down-Casting (형변환 필수)
        fe.drive();
        fe.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}