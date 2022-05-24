package classroom;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Enter please your username");
        username = scanner.nextLine();
        System.out.println("Username is:" + username);
    }
}
