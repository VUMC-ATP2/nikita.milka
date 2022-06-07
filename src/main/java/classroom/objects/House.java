package classroom.objects;

public class House {

    int houseNumber = 69; // lauks
    String propertyType = "flat";
    byte stories = 3;
    int bedrooms = 4;
    double marketValue = 150.000d;

    public void printInformation() {
        System.out.println("House number: " + houseNumber);
        System.out.println("Property type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Market value: " + marketValue);
    }
}
