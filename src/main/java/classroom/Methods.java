package classroom;

public class Methods {
    public static void main(String[] args) {
        printMyNameAndAge("Nikita", 27);

        String myCurrNm = "Nikita";
        int myCurrAg = 27;

        printMyNameAndAge(myCurrNm, myCurrAg);

        System.out.println(sumOfTwoNumbers(10, 30));
        int c = sumOfTwoNumbers(50, 100);
        System.out.println(c);

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        a = 30;
        b = 40;
        System.out.println(a + b);

        sumOfTwoNumbers(10, 20);
        sumOfTwoNumbers(30, 40);

        checkAge(14);
        checkAge(18);
        checkAge(25);

        System.out.println(isAdult(39));

    }

    public static void printMyNameAndAge(String name, int age) {
        System.out.printf("Your name is %s. And your age is %d\n", name, age);
    }

    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

    public static void checkAge(int age) {
        if(age < 0) {
            System.out.println("Are you alive?");
        } else if(age >= 14 && age <= 16) {
            System.out.println("Please wait, soon you will buy a Hektor");
        } else if (age == 17) {
            System.out.println("I believe you have a moustache!");
        } else if (age >= 18) {
            System.out.println("Run my friend, they sell alcohol till 22:00");
        }
    }

    public static boolean isAdult(int age) {
        boolean isAdult = false;
        if(age > 18) {
            isAdult = true;
        }
        return isAdult;
    }
}
