package java8.stream.ex3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Ex6 {
    public static void main(String[] args) {
        int localValue = 0;

        for (int i=0; i<5; i++) {
            localValue += i;
        }

        System.out.println(localValue);

        IntStream.range(0 , 5).forEach(i -> {
//            localValue += i;
//            compile error
        });
    }
}
