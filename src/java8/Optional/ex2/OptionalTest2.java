package java8.Optional.ex2;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTest2 {
    private static final String NULL_DATA = null;


    public static void main(String[] args) {
        // ifPresent (비어있는 Optional 객체를 받게되면 ifPresent 를 수행하지 않음)
        Optional.ofNullable("test").ifPresent(System.out::println);
        Optional.ofNullable(null).ifPresent(System.out::println);

        System.out.println("-----------------------------------------------------");

        // isPresent (객체의 존재여부 반환)
        System.out.println(Optional.ofNullable("Data").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());

        System.out.println("-----------------------------------------------------");

        // get (객체를 반환 , 비어있는 객체라면 예외 발생)
        System.out.println(Optional.ofNullable("Data").get());
//        System.out.println(Optional.ofNullable(null).get());

        System.out.println("-----------------------------------------------------");

        // orElse (Optional 객체가 비어있다면 기본값으로 제공할 객체 지정)
        String orElseResult = Optional.ofNullable("Data").orElse("Else");
        System.out.println(orElseResult);

        System.out.println("-----------------------------------------------------");

        String orElseResult2 = Optional.ofNullable(NULL_DATA).orElse("Else");
        System.out.println(orElseResult2);

        System.out.println("-----------------------------------------------------");

        // orElseGet (Optional 객첵가 비어있다면 기본값으로 제공할 공급자 함수 지정)
        String orElseGetResult = Optional.ofNullable("Data").orElseGet(() -> "default");
        System.out.println(orElseGetResult);

        String orElseGetResult2 = Optional.ofNullable(NULL_DATA).orElseGet(() -> "default");
        System.out.println(orElseGetResult2);

        System.out.println("-----------------------------------------------------");

        // orElseThrow (Optional 객체가 비어있다면 예외 공급자 함수를 통해 예외 발생)
        System.out.println(Optional.ofNullable("DATA").orElseThrow(NoSuchElementException::new));
        System.out.println(Optional.ofNullable(NULL_DATA).orElseThrow(NoSuchElementException::new));
    }
}
