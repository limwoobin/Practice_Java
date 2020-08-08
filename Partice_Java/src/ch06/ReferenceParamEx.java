package ch06;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main:" + d.x);

        change(d);
        System.out.println("main:" + d.x);
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("change:" + d.x);
    }
}
