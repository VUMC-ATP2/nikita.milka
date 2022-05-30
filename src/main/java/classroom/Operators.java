package classroom;

public class Operators {
    public static void main(String[] args) {
        // Equal to ==
        int a = 10;
        int b = 10;
        System.out.println(a == b); // true

        // Not equal to
        int c = 5;
        int d = 5;
        System.out.println(c != d); // false

        // Less than
        a = 30;
        b = 20;
        System.out.println(a < b); // false

        // Greater than
        c = 40;
        d = 50;
        System.out.println(c > d); // false

        boolean result = 40 < 20;
        System.out.println(result);

        // Less than or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        // Greater than or equal to
        a = 200;
        b = 100;
        System.out.println(b >= a);

        // String comparison
        String name = "Nikita";
        String name2 = "Nikita";
        System.out.println(name.equals(name2));

        // Logical operators
        int x = 10;
        result = x < 5 && x < 10;
        // 10 < 5 (false)
        // 10 < 10 (false)
        System.out.println(result);

        result = 3 < 5 && 4 > 5; // AND
        System.out.println(result);

        result = 3 < 5 || 4 > 5; // OR
        System.out.println(result);

        a = 10;
        b = 20;
        result = !(a > b);
        System.out.println(result);
        result = !(a < b);
        System.out.println(result);
    }
}
