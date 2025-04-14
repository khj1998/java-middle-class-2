package middle._06_Hash;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];

        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
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

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "elementData="+ Arrays.toString(Arrays.copyOf(buckets,size)) +
                ", size="+size+"}";
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) & capacity;
    }
}
