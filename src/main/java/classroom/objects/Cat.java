package classroom.objects;

public class Cat extends Animal {

    @Override
    void voice() {
        System.out.println("Meow!");
    }

    void eat() {
        System.out.println("Thank you for feeding!");
    }
}
