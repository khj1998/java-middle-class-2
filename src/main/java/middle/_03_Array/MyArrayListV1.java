package middle._03_Array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyArrayListV1() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int capacity) {
        this.elements = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public void add(Object o) {
        elements[size] = o;
        size ++;
    }

    public Object get(int index) {
        if (size == 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        return elements[index];
    }

    public Object set(int index, Object element) {
        elements[index] = element;
        return elements[index];
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements,size))
                + " size=" + size + ", capacity=" + elements.length;
    }
}
