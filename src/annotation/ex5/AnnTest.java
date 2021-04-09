package annotation.ex5;

@Maker(num = 9 , name = "wb")
public class AnnTest {
    public static void main(String[] args) {
        Class<AnnTest> obj = AnnTest.class;

        Maker maker = obj.getAnnotation(Maker.class);
        System.out.println(maker.num());
        System.out.println(maker.name());
        System.out.println(maker.date());
    }
}
