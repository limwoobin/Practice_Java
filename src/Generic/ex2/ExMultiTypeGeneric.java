package Generic.ex2;

import java.util.Map;

public class ExMultiTypeGeneric<K , V> implements Map.Entry<K , V> {

    private K key;
    private V value;

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }

    @Override
    public V setValue(V value) {
        return null;
    }
}
