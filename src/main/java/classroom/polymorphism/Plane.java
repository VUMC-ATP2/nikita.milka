package classroom.polymorphism;

public class Plane extends Vehicle {

    @Override
    public void move() {
        System.out.println("Called from: " + this.getClass().getName());
    }

    @Override
    public void stop() {
        System.out.println("Called from: " + this.getClass().getName());
    }
}
