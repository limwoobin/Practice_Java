package java8.Optional.ex2;

import java.util.*;

public class OptionalEx5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();

        System.out.println(optional); // Optional.empty
        System.out.println(optional.isPresent()); // false

        Optional<String> optional2 = Optional.ofNullable(getName());
        String name = optional2.orElse("anonymous"); // 값이 없다면 "anonymous" 를 리턴
        System.out.println(name);

        // Java8 이전
        List<String> names = getNames();
        List<String> tempNames = names != null ? names : new ArrayList<>();
        System.out.println(tempNames.toString());

        List<String> nameList = Optional.ofNullable(names).orElseGet(ArrayList::new);
        System.out.println(nameList.toString());
    }

    static String getName() {
        return "test";
    }

    static List<String> getNames() {
        return Arrays.asList("test" , "test2" , "test3");
    }
}
