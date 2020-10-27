package annotation.ex2;

public class Run {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ContextContainer demo = new ContextContainer();
        TestObject testObject = demo.get(TestObject.class);
        testObject.annotationTest();
    }
}
