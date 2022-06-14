package classroom.polymorphism;

public class Example {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.add(4, 6, 10));

        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();

        Car car = new Car();
        car.move();
        car.stop();

        Vehicle polymorphCar = new Car();
        polymorphCar.move();
    }
}
