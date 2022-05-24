package classroom;

public class MyFirstJavaCode {

    /*
    Access modifiers:
    public, private, protected, default
     */

    public static void main(String[] args) {
        System.out.println("Hello World! My name is: Nikita!");
        System.out.println("First argument is: " + args[0]);
        System.out.println("Second argument is: " + args[1]);

        // String[] args = {"Hello, "World};

        //String[] twoWords = {"Hello", "World"};

        // Primitive data type (numbers)

        byte floorCount = 7;
        byte[] floors = {1, 2, 3, 4, 5, 6, 7};

        // My house consist of 7 floors
        // Concatenation

        System.out.println("My house consist of " + floorCount + " floors!");
        System.out.printf("My house consist of %d floors!\n", floorCount);

        // %s = for String (text)
        // %d = for Number

        short juniorTesterSalaryInEur = 1000;
        short salariesInIt[] = {1000, 2000, 3000};
        short emptySalariesArray[] = new short[4];

        emptySalariesArray[0] = 1000;
        emptySalariesArray[1] = 2000;
        emptySalariesArray[2] = 3000;
        emptySalariesArray[3] = 4000;
        System.out.println(emptySalariesArray[2]);

        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is: %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China Population %d people\n", chinaPopulation);

        long currentWorldPopulation = 794609700;
        System.out.printf("Current World population: %d\n", currentWorldPopulation);

        // Floating numbers:

        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        /*
        Logical boolean
        prefix : is, has
        Example: isSummer, isWinter, hasItems, hasApples
        Values: true / false (default: false)
         */

        boolean isSummer = true;

        if (isSummer) {
            System.out.printf("Now it is summer! And boolean value is: %b\n", isSummer);
        } else {
            System.out.printf("No, summer will be the next! And boolean value is: %b\n", isSummer);
        }

        // Primitive: Text
        char firstNameLetter = 'N';
        System.out.println(firstNameLetter);

        // Non-Primitive String
        String myNameAndSurname = "Nikita Milka";
        System.out.println(myNameAndSurname);

        // Arithmetic Operators

        System.out.println(7 + 7);
        System.out.println("7 + 7");
        System.out.println("7" + 7);
        // Same here
        System.out.println("7" + "7");

        int a = 10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThanB = a > b;  // true
        System.out.printf("Is a greater than b: %b", isAGreaterThanB);
    }
}
