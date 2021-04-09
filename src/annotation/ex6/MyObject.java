package annotation.ex6;

public class MyObject {

    @CustomAnnotation(value = "My Annotation")
    public void annotationTest() {
        System.out.println("Hello! , Annotation.");
    }
}
