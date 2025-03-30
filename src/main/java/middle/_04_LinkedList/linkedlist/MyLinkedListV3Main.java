package middle._04_LinkedList.linkedlist;

import middle._04_LinkedList.linkedlist.MyLinkedListV3;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.getItem(1);

        if (!string.equals("b")) return;

        System.out.println(string);

        System.out.println("첫 번째 항목에 추가");
        stringList.add(0,"d");
        System.out.println(stringList);
        System.out.println("getLast : "+stringList.getLast());

        System.out.println("첫 번째 항목에 삭제");
        stringList.remove(0);
        System.out.println(stringList);

        System.out.println("중간 항목에 추가");
        stringList.add(1,"e");
        System.out.println(stringList);
        System.out.println("getLast : "+stringList.getLast());

        System.out.println("중간 항목에 삭제");
        stringList.remove(2);
        System.out.println(stringList);

        System.out.println("특정 원소 인덱스 값 뽑기");
        System.out.println(stringList.indexOf("c"));
    }
}
