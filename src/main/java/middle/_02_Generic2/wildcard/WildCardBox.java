package middle._02_Generic2.wildcard;

public class WildCardBox {
    public static void printAnimalnfo(Box<? extends Animal> animalBox) {
        System.out.println(animalBox.getData().toString());
    }

    public static void printAnimalName(Box<? extends Animal> animalBox) {
        System.out.println(animalBox.getData().getName());
    }

    public static void callAnimal(Box<? extends Animal> animalBox) {
        animalBox.getData().callName();
    }
}
