package java8.stream.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,5,1,6,7,0,9,8);
        Stream<Integer> stream = list.parallelStream();
        Stream<Integer> stream2 = list.stream();

        list.forEach(System.out::print);
        System.out.println();
        stream.forEach(System.out::print);
        System.out.println();
        stream2.forEach(System.out::print);
    }
}
