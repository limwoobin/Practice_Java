package Generic.ex6;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        listPrint(integerList);

        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);
        listPrint(longList);
    }

    static <T> void listPrint(List<? extends Number> list) {
        for (Number t : list) {
            System.out.println(t);
        }
    }
}
