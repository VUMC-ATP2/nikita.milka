package classroom.objects;

public class Car {

    int doorCount;
    int tyres = 4;
    int productionYear;
    int mileage;
    String color;
    String brand;
    boolean piekabesAkis;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public Car() {
        System.out.println("Car object is created!");
    }

    public Car(int doorCount, String color, boolean piekabesAkis) {
        this.doorCount = doorCount;
        this.color = color;
        this.piekabesAkis = piekabesAkis;
    }

    public Car(int doorCount, int tyres, int productionYear, int mileage, String color, String brand) {
        this.doorCount = doorCount;
        this.tyres = tyres;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
    }

    public void fillHalfCarData(String brand, String color) {
        this.brand = brand;
        this.color = color;
        System.out.println("Information updated!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                ", tyres=" + tyres +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", piekabesAkis=" + piekabesAkis +
                '}';
    }
}
