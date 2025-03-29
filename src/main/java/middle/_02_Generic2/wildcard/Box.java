package middle._02_Generic2.wildcard;

public class Box <T extends Animal> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public <Z extends Animal> Z printAndReturnGeneric(Z animal) {
        System.out.println(animal.toString());
        return animal;
    }
}
