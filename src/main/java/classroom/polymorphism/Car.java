package classroom.polymorphism;

public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("You call move() method from: " + this.getClass().getName());
        System.out.println("Engine started!");
    }

    @Override
    public void stop() {
        System.out.println("You call move() method from: " + this.getClass().getName());
        System.out.println("Engine stopped!");
    }
}
