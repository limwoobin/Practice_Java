package ch08;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외처리되었음");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외처리 되었음.");
            throw e;
        } 
    }
}
