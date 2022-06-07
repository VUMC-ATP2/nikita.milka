package classroom.objects;

public class AnimalPractice {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Unknown Animal";
        animal.voice();

        Dog rex = new Dog();
        rex.canProtectHouse = true;
        rex.voice();

        Cat minka = new Cat();
        minka.voice();
        minka.eat();
    }
}
