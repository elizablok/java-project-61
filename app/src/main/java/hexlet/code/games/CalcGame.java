package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.Utils;

public class CalcGame implements Game {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static int execute(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                return num1 * num2;
        }
    }
    public static String[][] build() {
        var res = new String[3][2];
        for (var i = 0; i < res.length; i++) {
            int randomNum1 = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            int randomNum2 = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            String randomOperator = Utils.generateOperator();
            String answer = Integer.toString(execute(randomNum1, randomNum2, randomOperator));
            String question = randomNum1 + " " + randomOperator + " " + randomNum2;
            res[i] = new String[]{question, answer};
        }
        return res;
    }

    public static void play() {
        var data = build();
        Engine.start(GAME_RULE, data);
    }
}
