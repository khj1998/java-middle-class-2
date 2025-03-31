package middle._05_Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) throws Exception {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(),size);
        addMid(new ArrayList<>(),size);
        addLast(new ArrayList<>(),size);


        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(),size);
        addMid(new LinkedList<>(),size);
        //강의에서는 마지막 노드까지 탐색하여 O(n)이다.
        //실제로 java의 LinkedList는 마지막 노드 정보를 가지고 있어, 해당 부분을 구현하여 O(1)이 되도록 하였다.
        addLast(new LinkedList<>(),size);

        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList,size);

        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size/2);
        getIndex(arrayList,loop,size-1);

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList,size);

        System.out.println("==LinkedList 조회==");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size/2);
        getIndex(linkedList,loop,size-1);


        System.out.println("==ArrayList 값으로 인덱스 검색==");
        getIndexByValue(arrayList,loop,0);
        getIndexByValue(arrayList,loop,size/2);
        getIndexByValue(arrayList,loop,size-1);

        System.out.println("==LinkedList 값으로 인덱스 검색==");
        getIndexByValue(linkedList,loop,0);
        getIndexByValue(linkedList,loop,size/2);
        getIndexByValue(linkedList,loop,size-1);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void addMid(List<Integer> list,int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(i/2,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void addLast(List<Integer> list,int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i =0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: "+index+", 반복: "+loop+", 계산 시간: "+(endTime - startTime)+"ms");
    }

    private static void getIndexByValue(List<Integer> list,int loop,int value) {
        long startTime = System.currentTimeMillis();
        for (int i =0; i < loop; i++) {
            list.indexOf(value);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("value: "+value+", 반복: "+loop+", 계산 시간: "+(endTime - startTime)+"ms");
    }
}
