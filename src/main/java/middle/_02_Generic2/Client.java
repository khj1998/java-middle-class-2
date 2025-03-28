package middle._02_Generic2;

public class Client {
    public static void main(String[] args) {
        Animal animal1 = new Dog("dog","월월","귀여운 리트리버");
        Animal animal2 = new Cat("cat","냐옹","고양이");
        AnimalHospital animalHospital = new AnimalHospital();

        animalHospital.updateAnimal(animal1);
        animalHospital.checkAnimalInfo();
        animalHospital.callNameByDoctor();
        animalHospital.checkSound();

        animalHospital.updateAnimal(animal2);
        animalHospital.checkAnimalInfo();
        animalHospital.callNameByDoctor();
        animalHospital.checkSound();
    }
}
