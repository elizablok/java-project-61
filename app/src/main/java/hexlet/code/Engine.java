package hexlet.code;

public class Engine {
    public static void start(String gameRule, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var username = Utils.getInput();
        System.out.println("Hello, " + username + "!");
        System.out.println(gameRule);

        int i = 0;

        while (i < gameData.length) {
            var question = gameData[i][0];
            var correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            var answer = Utils.getInput();

            if (correctAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            }
            i++;
        }

        if (i == 3) {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
