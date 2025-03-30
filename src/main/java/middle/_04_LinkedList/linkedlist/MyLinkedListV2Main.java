package middle._04_LinkedList.linkedlist;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        System.out.println("getLast : "+list.getLast());
        list.add("b");
        System.out.println("getLast : "+list.getLast());
        list.add("c");
        System.out.println("getLast : "+list.getLast());
        System.out.println(list);

        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d");
        System.out.println(list);
        System.out.println("getLast : "+list.getLast());

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(1,"e");
        System.out.println(list);
        System.out.println("getLast : "+list.getLast());

        System.out.println("중간 항목에 삭제");
        list.remove(2);
        System.out.println(list);

        System.out.println("특정 원소 인덱스 값 뽑기");
        System.out.println(list.indexOf("c"));
    }
}
