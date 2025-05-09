package middle._06_Hash;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value)); // 값을 기준으로 remove 하기 위해 primitive 타입을 객체 타입으로 래핑

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
        return "MyHashSetV1{" +
                "elementData="+ Arrays.toString(Arrays.copyOf(buckets,size)) +
                ", size="+size+"}";
    }

    private int hashIndex(int value) {
        return value % capacity;
    }
}
