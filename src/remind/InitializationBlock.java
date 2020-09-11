package remind;

public class InitializationBlock {

    static {
        System.out.println("static 초기화 블럭");
    }

    {
        System.out.println("instance 초기화 블럭");
    }

    InitializationBlock() {
        System.out.println("default 생성자");
    }

    public static void main(String[] args) {
        System.out.println("---------> 생성자 호출");
        InitializationBlock ib = new InitializationBlock();
    }
}
