package middle._02_Generic2.generic_basic;

public class AnimalHospital<T extends Animal> {
    private T animal;

    public void updateAnimal(T animal) {
        this.animal = animal;
    }

    public void checkAnimalInfo() {
        System.out.println(this.animal.toString());
    }

    public void checkSound() {
        this.animal.sound();
    }

    public void callNameByDoctor() {
        this.animal.callName();
    }
}
