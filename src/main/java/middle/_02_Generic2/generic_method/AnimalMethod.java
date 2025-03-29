package middle._02_Generic2.generic_method;

public class AnimalMethod {
    public static <T extends Animal> void checkAnimalInfo(T animal) {
        System.out.println(animal.toString());
    }

    public <T extends Animal> void checkSound(T animal) {
        animal.sound();
    }

    public <T extends Animal> void callNameByDoctor(T animal) {
        animal.callName();
    }
}
