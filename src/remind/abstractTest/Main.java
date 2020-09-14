package remind.abstractTest;

public class Main {
    public static void main(String[] args) {
        FirstCL fc = new FirstCL();
        SecondCL sc = new SecondCL();

        fc.commonPrint();
        sc.commonPrint();

        fc.justPrint();
        sc.justPrint();
    }
}
