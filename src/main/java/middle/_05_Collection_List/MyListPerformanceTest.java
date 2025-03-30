package middle._05_Collection_List;

import java.util.List;

public class MyListPerformanceTest {
    public static void main(String[] args) throws Exception {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(),size);
        addMid(new MyArrayList<>(),size);
        addLast(new MyArrayList<>(),size);


        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(),size);
        addMid(new MyLinkedList<>(),size);
        //강의에서는 마지막 노드까지 탐색하여 O(n)이다.
        //실제로 java의 LinkedList는 마지막 노드 정보를 가지고 있어, 해당 부분을 구현하여 O(1)이 되도록 하였다.
        addLast(new MyLinkedList<>(),size);

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList,size);

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList,loop,0);
        getIndex(arrayList,loop,size/2);
        getIndex(arrayList,loop,size-1);

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList,size);

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList,loop,0);
        getIndex(linkedList,loop,size/2);
        getIndex(linkedList,loop,size-1);


        System.out.println("==MyArrayList 값으로 인덱스 검색==");
        getIndexByValue(arrayList,loop,0);
        getIndexByValue(arrayList,loop,size/2);
        getIndexByValue(arrayList,loop,size-1);

        System.out.println("==MyLinkedList 값으로 인덱스 검색==");
        getIndexByValue(linkedList,loop,0);
        getIndexByValue(linkedList,loop,size/2);
        getIndexByValue(linkedList,loop,size-1);
    }

    private static void addFirst(MyList<Integer> list,int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void addMid(MyList<Integer> list,int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(i/2,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void addLast(MyList<Integer> list,int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i<size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : "+size+", 계산 시간"+(endTime - startTime)+"ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i =0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: "+index+", 반복: "+loop+", 계산 시간: "+(endTime - startTime)+"ms");
    }

    private static void getIndexByValue(MyList<Integer> list,int loop,int value) {
        long startTime = System.currentTimeMillis();
        for (int i =0; i < loop; i++) {
            list.indexOf(value);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("value: "+value+", 반복: "+loop+", 계산 시간: "+(endTime - startTime)+"ms");
    }
}
