package middle._05_Collection_List;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(E o) {
        if (elements.length == size) {
            grow();
        }

        elements[size] = o;
        size ++;
    }

    @Override
    public void add(int index,E o) {
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

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        elements[index] = element;
        return (E) elements[index];
    }

    @Override
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public E remove(int index) {
        E element = get(index);
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
