package middle._06_Hash;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = "+ Arrays.toString(inputArray));

        int searchValue = 8;
        Integer result = inputArray[searchValue]; // O(1)이긴 하지만....저장하고자 하는 값이 매우크면 메모리 낭비가 심해진다.
    }
}
