package annotation.ex4;

import java.lang.reflect.Method;

public class Run {
    public static void main(String[] args) {
        Hello hello = new Hello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello");
            if (method.isAnnotationPresent(Repeat100.class)) {
                System.out.println("어노테에션 존재");
                for (int i=0; i<100; i++) {
                    hello.hello();
                }
            } else {
                System.out.println("어노테이션 미존재");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
