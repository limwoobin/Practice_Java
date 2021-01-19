package java8.stream.ex3;

import java.util.stream.IntStream;

public class Ex2 {
    public static void main(String[] args) {
        //for-loop로 짠 경우
        for (int i = 0; i < 100; i++) {
            if (i > 50) {
                break;
                //50번 돌고 반복을 종료한다.
            }
            System.out.println(i);
        }

        IntStream.range(1, 100).forEach(i -> {
            if (i > 50) {
                return;
                //각 수행에 대해 다음 수행을 막을 뿐, 100번 모두 조건을 확인한 후에야 종료한다.
            }
            System.out.println(i);
        });

        // stream 의 올바른 사용 (forEach 내에 로직을 처리하는것이 아닌 map or filter 등의 메소드를 이용해
        // 로직을 처리하는 것이 올바른 사용법
        IntStream.range(1, 100).filter(i -> i <= 50).forEach(System.out::println);
    }
}
