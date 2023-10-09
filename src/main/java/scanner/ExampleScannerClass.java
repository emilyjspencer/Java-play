package scanner;

import java.util.Scanner;

public class ExampleScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("PLease enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
        scanner.close();
    }
}
