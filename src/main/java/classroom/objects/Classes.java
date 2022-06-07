package classroom.objects;

public class Classes {
    public static void main(String[] args) {

        House myHouse = new House();
        myHouse.printInformation();

        System.out.println("==============");

        myHouse.houseNumber = 2;
        myHouse.marketValue = 170.000d;
        myHouse.printInformation();

        System.out.println("==============");

        House summerHouse = new House();
        summerHouse.propertyType = "summerhouse";
        summerHouse.stories = 1;
        summerHouse.printInformation();

        Circle circle = new Circle();
        double result = circle.circleArea(50);


    }
}
