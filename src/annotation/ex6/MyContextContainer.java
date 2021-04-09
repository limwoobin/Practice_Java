package annotation.ex6;

import java.lang.reflect.Method;

public class MyContextContainer {
    public MyContextContainer() {

    }

    private <T> T invokeAnnotations(T instance) {
        Method[] methods = instance.getClass().getDeclaredMethods();

        for (Method method : methods) {
            CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
            if (annotation != null) {
                System.out.println(annotation.value());
            }
        }

        return instance;
    }

    public <T> T get(Class clazz) throws InstantiationException, IllegalAccessException {
        T instance = (T) clazz.newInstance();
        instance = invokeAnnotations(instance);
        return instance;
    }
}
