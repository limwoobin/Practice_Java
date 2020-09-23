package remind.instanceOf;

public class InstanceOf {
    public static void main(String[] args) {
        ParentTest pt = new ParentTest();
        ChildTest ct = new ChildTest();

//        pt = ct;
//        ct = (ChildTest) pt;

        if (ct instanceof ParentTest) {
            System.out.println("child instanceof parent!!!");
        }

        if (ct instanceof ChildTest) {
            System.out.println("child instanceof child!!!");
        }

        if (pt instanceof  ChildTest) {
            System.out.println("parent instanceof child!!!");
        }

        if (pt instanceof ParentTest) {
            System.out.println("parent instanceof parent");
        }
    }
}


class ParentTest {

}

class ChildTest extends ParentTest {

}