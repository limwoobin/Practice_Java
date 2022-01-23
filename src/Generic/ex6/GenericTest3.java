package Generic.ex6;

import java.util.ArrayList;
import java.util.List;

public class GenericTest3 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        listPrint(integerList);

        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);
        listPrint2(longList);
    }

    static void listPrint(List<?> list) {
        for (Object t : list) {
            System.out.println(t);
        }
    }

    static void listPrint2(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }
}
