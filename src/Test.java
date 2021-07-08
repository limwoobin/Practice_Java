import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        TestVO testVO = new TestVO(null , null);
        TestVO testVO2 = new TestVO(null , null);

        List<TestVO> list = new ArrayList<>();
        list.add(testVO);
        list.add(testVO2);

        System.out.println(list.get(0).getA());
        System.out.println(list.get(0).getB());

//        System.out.println(Date.valueOf(list.get(0).getA()));

        Boolean bb = null;
        System.out.println(bb);
    }
}

class TestVO {
    public TestVO(String a , String b) {
        this.a = a;
        this.b = b;
    }

    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}