package remind;

public class FinalTest {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    FinalTest(int num , String kind) {
        NUMBER = num;
        KIND = kind;
    }

    FinalTest() {
        this(1 , "HEART");
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }

    public static void main(String[] args) {
        FinalTest ft = new FinalTest(10 , "HEART");
        System.out.println(ft.NUMBER);
        System.out.println(ft.KIND);
        System.out.println(ft);
    }
}
