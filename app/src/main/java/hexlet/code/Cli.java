package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetByName() {
        var scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var username = scanner.next();
        System.out.println("Hello, " + username + " !");
    };
}
