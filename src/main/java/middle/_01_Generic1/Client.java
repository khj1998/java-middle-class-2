package middle._01_Generic1;

public class Client {
    public static void main(String[] args) throws Exception {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(1);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");

        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(new Object());

        /**
         * 제네릭 활용으로 같은 의도를 가지는 여러 개의 클래스를 제거할 수 있다.
         */
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setValue(1);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hello");

        GenericBox<Object> objectGenericBox = new GenericBox<>();
        objectGenericBox.setValue(new Object());

        /**
         * 타입 인자를 명시하지 않는 경우 Object로 자동 해석된다. (로타입 선언)
         */
        RowTypeGeneric rowTypeGeneric = new RowTypeGeneric();
    }
}
