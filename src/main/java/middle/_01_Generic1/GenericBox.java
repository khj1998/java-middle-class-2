package middle._01_Generic1;

/**
 * 제네릭이 해결한 기존 Box의 문제 : 코드의 중복
 * 또한, 컴파일 타입에서 타입이 올바르게 쓰이는지 검사하기 때문에 런타입에서 타입 안정성을 확보할 수 있다.
 * 제네릭 파라미터를 그대로 쓰면, 런타임에서 Object로 변환된다. (타입 캐스팅으로 형변환함.)
 */
public class GenericBox<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
