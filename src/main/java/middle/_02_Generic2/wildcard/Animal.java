package middle._02_Generic2.wildcard;

public class Animal {
    private String type;
    private String sound;
    private String name;

    public Animal(String type, String sound, String name) {
        this.type = type;
        this.sound = sound;
        this.name = name;
    }

    public void sound() {}

    public void callName() {}

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    @Override
    public String toString() {
        return "animal type : "+this.type+" name : "+this.name;
    }
}
