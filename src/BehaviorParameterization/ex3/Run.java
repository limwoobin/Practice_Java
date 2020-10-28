package BehaviorParameterization.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {
    public static void main(String[] args) {
        Apple apple1 = new Apple(200 , Apple.Color.RED);
        Apple apple2 = new Apple(130 , Apple.Color.GREEN);
        Apple apple3 = new Apple(180 , Apple.Color.RED);
        Apple apple4 = new Apple(220 , Apple.Color.GREEN);
        List<Apple> apples = Arrays.asList(apple1 , apple2 , apple3 , apple4);

        List<Apple> redAndHeavyApples = filterApplesGeneric(apples , new AppleRedAndHeavyPredicate());
        for (Apple apple : redAndHeavyApples) {
            System.out.println(apple.getWeight());
            System.out.println(apple.getColor());
        }
    }

    public static <T> List<T> filterApplesGeneric(List<T> inventory , ApplePredicate p) {
        return inventory.stream().filter(apple -> p.test(apple)).collect(Collectors.toList());
    }
}
