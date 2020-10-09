package java8.stream.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TestVO testVO = new TestVO("Test1" , 1);
        TestVO testVO2 = new TestVO("Test2" , 2);
        TestVO testVO3 = new TestVO("Test3" , 3);

        List<TestVO> tests = Arrays.asList(testVO , testVO2 , testVO3);
        tests.forEach(s -> System.out.println(s.toString()));

        System.out.println();
        tests.stream().filter(s -> s.getTestAge() != 1).forEach(s -> System.out.println(s.toString()));

        System.out.println();

        List<TestVO> filterList = tests.stream().filter(s -> s.getTestAge() != 1).collect(Collectors.toList());
        filterList.forEach(s -> System.out.println(s.toString()));
    }
}
