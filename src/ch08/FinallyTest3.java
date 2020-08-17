package ch08;

public class FinallyTest3 {
    public static void main(String[] args) {
//        FinallyTest3.method1();
        method1();
        System.out.println("method1 의 수행을 마치고 main으로 복귀");
    }

    static void method1() {
        try {
            System.out.println("method1 호출");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1의 finally 블록 실행");
        }
    }
}
