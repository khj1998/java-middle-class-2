package middle._02_Generic2.generic_basic;

public class Cat extends Animal {
    public Cat(String type, String sound, String name) {
        super(type, sound, name);
    }

    @Override
    public void sound() {
        System.out.println("pet is making sound : "+this.getSound());
    }

    @Override
    public void callName() {
        System.out.println("calling name : "+this.getName());
    }
}
