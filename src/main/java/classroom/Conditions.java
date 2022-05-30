package classroom;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Before check");

        // Will execute 10 line if condition is true
        if (20 > 18) {
            System.out.println("Yes, 20 > 18");
        }

        System.out.println("After check");

        int age = 18;

        if (age >= 18) {
            System.out.println("You can vote!");
        }
        System.out.println("You can go home!");

        int currentHours = 10;
        if (currentHours < 18) { // true
            System.out.println("Good day!"); // Labdien
        } else {
            System.out.println("Good evening!"); // Labvakar
        }

        int i = 20;
        if (i < 15) { // 20 < 15 ? false
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");
        }
        System.out.println("Outside if-else block");

        String vumc = "LU";
        if (vumc == "LU") { //
            System.out.println("VUMC is the same as LU");
        } else {
            System.out.println("VUMC is not the same as LU");
        }

        // int - primitive type
        // Integer - non-primitive
        // char - Char
        // double - Double
        // float - Float

        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);

        int number = 5;
        if (number <= 0) { // false
            System.out.println("Number is greater than 0");
        } else if (number > 3) {
            System.out.println("Number is equal to 0"); // print
        } else if (number > 2) {
            System.out.println("Number is less then 2");
        } else {
            System.out.println("Number is less then 2 and not equal to 0");
        }

        String animal = "Mouse";

        switch (animal) {
            case "Cat":
            case "Dog":
                System.out.println("You most probably have Cat or Dog");
                break;
            case "Tiger":
                System.out.println("You have a tiger");
                break;
            default:
                System.out.println("I don't know about animal you have: " + animal);
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not incorrect day of the week!");
        }
    }
}
