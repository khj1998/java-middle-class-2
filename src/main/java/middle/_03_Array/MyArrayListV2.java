package middle._03_Array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyArrayListV2() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int capacity) {
        this.elements = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public void add(Object o) {
        //예외 로직 추가
        if (elements.length == size) {
            grow();
        }

        elements[size] = o;
        size ++;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity * 2;
        elements = Arrays.copyOf(elements,newCapacity);
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
