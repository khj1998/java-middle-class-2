package middle._06_Hash;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;
    private int capacity = DEFAULT_INITIAL_CAPACITY;
    int size = 0;

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];

        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value); // 값을 기준으로 remove 하기 위해 primitive 타입을 객체 타입으로 래핑

        if (result) {
            size --;
            return true;
        }

        return false;
    }

    public int getSize() {
        return this.size;
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) & capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "elementData="+ Arrays.toString(Arrays.copyOf(buckets,size)) +
                ", size="+size+"}";
    }
}
