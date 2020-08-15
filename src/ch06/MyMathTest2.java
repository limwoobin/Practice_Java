package ch06;

class MyMath2 {
    long a, b;

    long add() { return a + b; }
    long substract() { return a - b; }
    long multiply() { return a * b; }
    double devide() { return a / b; }

    static long add(long a , long b) { return a + b; }
    static long substract(long a , long b) { return a - b; }
    static long multiply(long a , long b) { return a * b; }
    static double device(long a , long b) { return a / b; }
}

public class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200l , 100l));
        System.out.println(MyMath2.substract(200l , 100l));
        System.out.println(MyMath2.multiply(200l , 100l));
        System.out.println(MyMath2.device(200l , 100l));

        MyMath2 mm = new MyMath2();
        mm.a = 200l;
        mm.b = 100l;

        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multiply());
        System.out.println(mm.devide());
    }
}
