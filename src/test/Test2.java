package test;

public class Test2 {
    public static void main(String[] args) {
        int numOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(numOfCores);
    }
}
