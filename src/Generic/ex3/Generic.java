package Generic.ex3;

import java.util.Arrays;
import java.util.List;

public class Generic {

    public void printList(List<? extends Number> list) {
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        Generic generic = new Generic();

        List<Integer> list = Arrays.asList(1,3,5,7,9);
        generic.printList(list);

        List<String> list2 = Arrays.asList("A","B","C","D","E");
//        generic.printList(list2); -> compile error

        List<Double> list3 = Arrays.asList(1.0 , 2.0 , 3.0 , 4.0 , 5.0);
        generic.printList(list3);
    }
}
