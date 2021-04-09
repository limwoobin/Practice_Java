package annotation.ex6;

public class Run {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyContextContainer contextContainer = new MyContextContainer();
        MyObject object = contextContainer.get(MyObject.class);
        object.annotationTest();
    }
}
