package java8.lambda.ex4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex1 {
    public static void main(String[] args) {
        Function<String , Integer> function = Integer::parseInt;
        System.out.println(function.apply("5"));

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(2));

        Consumer<String> consumer = System.out::println;
        consumer.accept("zzz");
    }
}
