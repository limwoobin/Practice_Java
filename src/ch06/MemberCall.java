package ch06;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv2;      // error!
    static int cv2 = new MemberCall().iv2; // 객체 생성해서 사용

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // 클래스 메소드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); // 클래스메서드에서 인스턴스메서드 사용 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() { // 인스턴스메서드는 스태틱메서드 , 인스턴스메서드 둘다 사용 가능
        staticMethod1();
        instanceMethod1();
    }
}
