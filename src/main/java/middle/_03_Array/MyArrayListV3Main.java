package middle._03_Array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        // 데이터 추가
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("Add First");
        list.add(0,"Add First");
        System.out.println(list);

        System.out.println("Add Last");
        list.add(4,"Add Last");
        System.out.println(list);

        //삭제
        Object removed1 = list.remove(0);
        System.out.println("removed element  : "+removed1);
        System.out.println(list);

        Object removed2 = list.remove(3);
        System.out.println("removed element  : "+removed2);
        System.out.println(list);
    }
}
