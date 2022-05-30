package classroom;

public class LoopsPractice {
    public static void main(String[] args) {
        // 0 - 4;

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i = i + 1; // or i++;
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        // Print out array values using while
        int[] arr = {2, 11, 45, 9};
        int number = 0;
        while (number < arr.length) {
            System.out.println(arr[number]); // arr[0] arr[1] arr[2]
            number++; // 0 + 1; 1 + 1;
        }

        // Print out even numbers from 0 to 10;
        // i % 2 == 0;
        number = 0;
        System.out.println("While START");
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("While END");


        // 18 - 65
        int age = 18;
        do {
            System.out.print(age + ", ");
            age++;
        } while (age <= 65);

        // Print out even numbers from 0 to 10; use do-while
        number = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 10);


        for (int x = 0; x <= 10; x++) {
            System.out.print(x + ", ");
        }
        System.out.println("");

        // for
        String[] countries = new String[]{"Latvia", "Canada", "USA", "Estonia", "USA"};
        for (int j = 0; j < 4; j++) {
            System.out.println(countries[j]);
        }

        // for each
        for (String country : countries) {
            System.out.println(country);
        }

        // Create int[] array with numbers from 0 to 100
        // Print numbers that are > than 50;

        int[] numArray = new int[100];
        for (int y = 0; y < numArray.length; y++) {
            numArray[y] = y;
        }
        System.out.println("==============");
        // "Latvia", "Canada", "USA", "Estonia", "USA"
        for (String country : countries) {
            System.out.println(country);
            if (country.equals("USA")) {
                System.out.println("I found USA! Breaking the loop!");
                break;
            }
        }

        // For loop 1 - 10;
        // If value of i ir between 4 un 9
        // continue

        for (int j = 1; j <= 10; j++) {
            if(j > 4 && j < 9) {
                continue;
            }
            System.out.println(j);
        }
    }
}
