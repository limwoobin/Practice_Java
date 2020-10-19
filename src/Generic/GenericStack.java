package Generic;

import java.util.EmptyStackException;

public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_SIZE = 16;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_SIZE];
    }

    public void push(E e) {
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) throw new EmptyStackException();

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}