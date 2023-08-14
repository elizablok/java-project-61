package hexlet.code;

public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var username = Utils.getInput();
        System.out.println("Hello, " + username + "!");
    }
}
