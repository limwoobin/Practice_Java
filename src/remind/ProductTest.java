package remind;

public class ProductTest {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public static void main(String[] args) {
        ProductTest t1 = new ProductTest();
        ProductTest t2 = new ProductTest();
        ProductTest t3 = new ProductTest();

        System.out.println(t1.serialNo);
        System.out.println(t2.serialNo);
        System.out.println(t3.serialNo);
    }
}
