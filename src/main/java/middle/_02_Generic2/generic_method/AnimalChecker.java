package middle._02_Generic2.generic_method;

/**
 * 제네렉은 컴파일 후 런타임에서 Object 형으로 타입 이레이저 과정을 거친다.
 * 따라서 instance of 를 직접 제네릭에 쓸 수 없다.
 * 타입 파라미터/매개변수의 선언 문자를 다르게 하는게 좋다. 무엇보다 헷갈리지 않는 게 중요 (개발자 입장 가독성)
 * 제네릭 타입을 결정하는데 메서드가 클래스보다 우선순위를 가짐.
 */
public class AnimalChecker <T extends Animal>{
    public static <Z extends Animal> boolean checkCatType(Class<Cat> catClass, Z z) {
        return catClass.isInstance(z);
    }

    public static <Z extends Animal> boolean checkDogType(Class<Dog> dogClass, Z z) {
        return dogClass.isInstance(z);
    }
}
