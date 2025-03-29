package middle._02_Generic2.generic_method;

public class AnimalMethodClient {
    public static void main(String[] args) throws Exception {
        AnimalMethod animalMethod = new AnimalMethod();

        Animal animal1 = new Dog("dog","월월","귀여운 리트리버");
        Animal animal2 = new Cat("cat","냐옹","고양이");

        if (AnimalChecker.checkDogType(Dog.class,animal1)) {
            animalMethod.callNameByDoctor(animal1);
            animalMethod.checkSound(animal1);
        }

        if (AnimalChecker.checkCatType(Cat.class,animal2)) {
            animalMethod.callNameByDoctor(animal2);
            animalMethod.checkSound(animal2);
        }
    }
}
