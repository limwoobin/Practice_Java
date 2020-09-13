package remind;

public class OverloadingAndOverriding {
    public static void main(String[] args) {

    }
}


class Parent {
    public void parentPrint() {
        System.out.println("Parent!!!");
    }
}

class Child extends Parent {
    @Override
    public void parentPrint() { // 오버라이딩
        System.out.println("Child!!!");
    }

    public void parentPrint(int i) { // 오버로딩
        System.out.println("Child Print");
    }
}