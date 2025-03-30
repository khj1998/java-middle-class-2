package middle._04_LinkedList.linkedlist;

import middle._03_Array.MyArrayListV1;

public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();

        System.out.println("==데이터 추가==");
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.get(1) = "+list.getItem(1));
        System.out.println("list.indexOf('c') = "+list.indexOf("c"));
        System.out.println("list.set(2,'z') = "+list.set(2,"z"));

        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
    }
}
