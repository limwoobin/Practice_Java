package java8.stream.ex1;

public class TestVO {
    private String testName;
    private int testAge;

    public TestVO(String testName , int testAge) {
        this.testName = testName;
        this.testAge = testAge;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getTestAge() {
        return testAge;
    }

    public void setTestAge(int testAge) {
        this.testAge = testAge;
    }

    @Override
    public String toString() {
        return "TestVO{" +
                "testName='" + testName + '\'' +
                ", testAge=" + testAge +
                '}';
    }
}
