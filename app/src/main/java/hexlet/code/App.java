package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        var gameChoice = Utils.getInput();
        System.out.print("Your choice: " + gameChoice);

        switch (gameChoice) {
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
