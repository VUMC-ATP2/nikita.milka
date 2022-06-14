package classroom.polymorphism;

public class Vehicle {

    public void move() {
        System.out.println("You call move() method from: " + this.getClass().getName());
    }

    public void stop() {
        System.out.println("You call stop() method from: " + this.getClass().getName());
    }
}
