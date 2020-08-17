package test;

public class test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof A);



        A a1 = new B();
        Object o1 = new B();
//        B b1 = (B) new A(); 런타임 오류
        B b2 = (B) a1;

        String[] arr = {"A" , "B" , "C"};
        print(arr);
    }

    static void print(String... arr) {
        System.out.println(arr.length);
        for (String msg : arr) {
            System.out.println(msg);
        }
    }
}

class A {

}

class B extends A {

}