package Generic.ex3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {

    private List<T> list = new ArrayList<>();


    public void add(T t) {
        list.add(t);
    }

    public T get(int index) {
        return list.get(index);
    }


    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("A");
        System.out.println(list.get(0));

        GenericList<Integer> list2 = new GenericList<>();
        list2.add(50);
        System.out.println(list2.get(0));
    }
}
