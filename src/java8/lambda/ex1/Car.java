package java8.lambda.ex1;

import java.util.ArrayList;
import java.util.List;

public class Car implements Movable {

    @Override
    public void move(String str) {
        System.out.println("Car move " + str);
    }

    Movable movable = new Movable() {

        @Override
        public void move(String str) {
            System.out.println("Car move2 " + str);
        }
    };

    Movable movable2 = (str -> System.out.println("Car move3 " + str));

    Movable movable3 = str -> System.out.println("Car move4 " + str);
}
