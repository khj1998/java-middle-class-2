package middle._06_Hash;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = "+ Arrays.toString(inputArray));

        int searchValue = 8;

        //O(n) 성능으로 검색
        for (int i : inputArray) {
            if (i == searchValue) {
                System.out.println(searchValue);
                break;
            }
        }
    }
}
