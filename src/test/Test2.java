package test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.toString());
        System.out.println(list.contains("B"));
        System.out.println(list.contains("D"));
    }
}
