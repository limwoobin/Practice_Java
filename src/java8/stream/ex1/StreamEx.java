package java8.stream.ex1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("A" , "B" , "C" , "D");
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.print(s));

        System.out.println();

        int[] arr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(s -> System.out.print(s));
    }
}
