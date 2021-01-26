package java8.stream.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        // Collection 자료구조는 삽입 , 삭제 가능
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        list.remove(0);
        list.add(1);
        System.out.println(list.toString());


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        Stream<Integer> stream = list2.stream();
        // 스트림에 요소를 삽입 , 삭제 불가
    }
}
