package annotation.ex2;

import java.lang.reflect.Method;

public class ContextContainer {
    public ContextContainer() {

    }

    private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
        Method[] methods = instance.getClass().getDeclaredMethods();

        for (Method method : methods) {
            DrAnnotation annotation = method.getAnnotation(DrAnnotation.class);
            if (annotation != null) {
                System.out.println(annotation.value());
            }
        }

        return instance;
    }

    public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
        T instance = (T) clazz.newInstance();
        instance = invokeAnnotations(instance);
        return instance;
    }
}
