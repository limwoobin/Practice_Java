package java8.stream.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex4 {
    public static void main(String[] args) {
        // Collection 은 허가되지 않은 동작을 감지시 ConcurrentModificationException 을 리턴한다
        // ex) Collection 반복 중 데이터 변경

        collectionTest();
        streamTest();
    }

    static void collectionTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Consumer<Integer> removeIfEven = num -> {
            System.out.println(num);
            if (num % 2 == 0) {
                list.remove(num);
            }
        };

        list.forEach(removeIfEven);
    }

    static void streamTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Consumer<Integer> removeIfEven = num -> {
            System.out.println(num);
            if (num % 2 == 0) {
                list.remove(num);
            }
        };

        list.stream().forEach(removeIfEven);
    }
}
