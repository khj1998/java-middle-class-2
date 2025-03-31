package middle._06_Hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class HashCollisionImpl {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets = "+ Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,3);
        add(buckets,9);
        add(buckets,99);
        System.out.println("buckets = "+ Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        System.out.println("bucket.contains("+searchValue+") = "+contains(buckets,searchValue));
    }

    private static void add(LinkedList<Integer>[] buckets,int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] buckets,int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
}
