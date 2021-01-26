package java8.stream.ex3;

import java.util.stream.IntStream;

public class Ex3 {
    public static void main(String[] args) {
        // for-loop 와 Stream.forEach 비교
        long t1 = System.nanoTime();
        for (int i=0; i<100; i++) {
            if (i > 50) {
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println(System.nanoTime() - t1);


        long t2 = System.nanoTime();
        IntStream.range(1 , 100).forEach(i -> {
            if (i > 50) {
                return;
                // 각 수행에 대해 다음 수행을 막을 뿐 , 100 번 모두 조건을 확인
            }
            System.out.print(i);
        });
        System.out.println();
        System.out.println(System.nanoTime() - t2);

        long t3 = System.nanoTime();
        IntStream.range(1 , 100)
                .filter(i -> i <= 50)
                .forEach(System.out::print);
        System.out.println();
        System.out.println(System.nanoTime() - t3);
    }
}
