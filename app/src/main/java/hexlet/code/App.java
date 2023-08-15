package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        var gameChoice = Utils.getInput();

        switch (gameChoice) {
            case "3":
                CalcGame.play();
                break;
            case "2":
                EvenGame.play();
                break;
            case "1":
                Cli.greet();
                break;
            default:
                break;
        }
    }
}
