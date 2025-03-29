package middle._03_Array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyArrayListV3() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int capacity) {
        this.elements = new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public void add(Object o) {
        if (elements.length == size) {
            grow();
        }

        elements[size] = o;
        size ++;
    }

    public void add(int index,Object o) {
        if (elements.length == size) {
            grow();
        }

        shiftRightFrom(index);
        elements[index] = o;
        size ++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size ; i > index ; i--) {
            elements[i] = elements[i-1];
        }
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

    public Object remove(int index) {
        Object element = get(index);
        shiftLeftFrom(index);

        size --;
        elements[size] = null;

        return element;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index ; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements,size))
                + " size=" + size + ", capacity=" + elements.length;
    }
}
