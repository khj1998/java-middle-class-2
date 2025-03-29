package middle._02_Generic2.wildcard;

public class WildCardClient {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Dog("dog","월월","귀여운 리트리버");
        Animal animal2 = new Cat("cat","냐옹","고양이");

        Box box1 = new Box(animal1);
        Box box2 = new Box(animal2);

        WildCardBox.callAnimal(box1);
        WildCardBox.printAnimalName(box1);
        WildCardBox.printAnimalnfo(box1);

        WildCardBox.callAnimal(box2);
        WildCardBox.printAnimalName(box2);
        WildCardBox.printAnimalnfo(box2);
    }
}
