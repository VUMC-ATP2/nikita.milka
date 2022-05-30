package classroom;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        boolean para = number % 2 == 0;
        if(para) {
            System.out.println("Para skaitlis");
        } else {
            System.out.println("Nepara skaitlis");
        }
    }
}
