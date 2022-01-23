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
    }

    static void listPrint(List<?> list) {
        for (Object t : list) {
            System.out.println(t);
        }
    }
}
