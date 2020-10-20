package Generic.ex4;

public class GenericArray<T> {

    private Object[] elementData = new Object[10];
    private int size;

    public void add(T val) {
        elementData[size++] = val;
    }

    public T get(int idx) {
        return (T) elementData[idx];
    }

    public static void main(String[] args) {
        GenericArray<String> stringArray = new GenericArray<>();
        stringArray.add("A");
        stringArray.add("B");
        System.out.println(stringArray.get(0));
        System.out.println(stringArray.get(1));


        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.add(1);
        intArray.add(3);
        intArray.add(5);
        System.out.println(intArray.get(0));
        System.out.println(intArray.get(1));
        System.out.println(intArray.get(2));
    }
}
