package annotation.ex3;

public class AnnotationExam02 {

    @InsertStringData(data = "Drogba")
    private String myData;

    @InsertStringData
    private String defaultData;

    public AnnotationExam02() {
        myData = "No data";
        defaultData = "No data";
    }

    public String getMyData() {
        return myData;
    }

    public String getDefaultData() {
        return defaultData;
    }
}
