package remind.anonymous;


interface Test {
    void go();
}

class Test2 {
    void go2() {

    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Test test = new Test() {

            @Override
            public void go() {
                System.out.println("Go! Go!");
            }
        };

        test.go();

        Test2 test2 = new Test2() {

            @Override
            void go2() {
                System.out.println("Go2! Go2!");
            }
        };

        test2.go2();
    }
}
