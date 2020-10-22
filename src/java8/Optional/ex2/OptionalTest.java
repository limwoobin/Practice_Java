package java8.Optional.ex2;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // filter (true면 필터를 통과 , flase 면 통과 되지 않음)
        System.out.println(Optional.of("True").filter(v -> "True".equals(v)).orElse("NO DATA")); // -> True
        System.out.println(Optional.of("False").filter(v -> "True".equals(v)).orElse("NO DATA")); // -> NO DATA

        // map (입력값을 다른 값으로 변환)
        Integer test = Optional.of("1").map(Integer::valueOf).orElseThrow(NoSuchMethodError::new);
        System.out.println(test);

        String test2 = Optional.of("A").map(v -> v + "B").orElseThrow(NoSuchFieldError::new);
        System.out.println(test2);

        // flatMap 값을 Optional 로 반환
        String flatMapTest = Optional.of("result").flatMap(v -> Optional.of("good")).get();
        System.out.println(flatMapTest);

        Optional<String> flatMapTest2 = Optional.of("result").flatMap(v -> Optional.of("data"));
        System.out.println(flatMapTest2.get());
    }
}
