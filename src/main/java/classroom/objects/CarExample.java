package classroom.objects;

public class CarExample {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.color = "black";
        System.out.println();

        Car audi = new Car();
        System.out.println("Color of my car is: " + audi.color);
        audi.fillHalfCarData("AUDI", "blue");
        System.out.println("Color of my car is: " + audi.color);
        audi.color = "RED";
        System.out.println("Color of my car is: " + audi.color);

        Car bmw2 = new Car("Black", "BMW");
        System.out.println(bmw.brand);
        System.out.println(bmw.color);
        Car skoda = new Car(4, 4, 2022, 9, "blue", "Skoda");
        System.out.println(skoda);

        Car alfaRomeo = new Car();
        alfaRomeo.doorCount = 6;
        alfaRomeo.color = "aqua";

        Car audiA6 = new Car(4, "", true);


    }
}
