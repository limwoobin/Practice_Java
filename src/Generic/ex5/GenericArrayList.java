package Generic.ex5;

import java.util.List;

public class GenericArrayList<T> {
    private T[] elementData = (T[]) new Object[5];
    private int size;

    public void add(T value) {
        elementData[size++] = value;
    }

    public T get(int index) {
        return elementData[index];
    }

    public <T extends Number> T access(T t) {
        return t;
    }

    public int getArray(List<? extends Number> list) {
        return (int) list.get(0);
    }
}
