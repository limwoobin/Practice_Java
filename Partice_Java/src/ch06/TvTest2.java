package ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println(tv1.channel);
        System.out.println(tv2.channel);

        tv1.channel = 7;
        System.out.println(tv1.channel);
        System.out.println(tv2.channel);
    }
}
