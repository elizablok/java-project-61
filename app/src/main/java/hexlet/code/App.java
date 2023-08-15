package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        var gameChoice = Utils.getInput();

        switch (gameChoice) {
            case "1":
                Cli.greet();
                break;
            case "2":
                EvenGame.play();
                break;
            case "3":
                CalcGame.play();
                break;
            case "4":
                GCDGame.play();
                break;
            case "5":
                ProgressionGame.play();
                break;
            case "6":
                PrimeGame.play();
                break;
            default:
                break;
        }
    }
}
