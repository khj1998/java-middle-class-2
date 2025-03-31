package middle._06_Hash;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elements = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }

        elements[size++] = value;
        return true;
    }

    public boolean contains(int value) {
        for (int data : elements) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData="+ Arrays.toString(Arrays.copyOf(elements,size)) +
                ", size="+size+"}";
    }
}
