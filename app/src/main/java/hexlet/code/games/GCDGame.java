package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.Utils;

public class GCDGame implements Game {
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    private static int execute(int num1, int num2) {
        if (num1 % num2 != 0) {
            return execute(num2, num1 % num2);
        }
        return num2;
    }
    private static String[][] build() {
        var res = new String[3][2];
        for (var i = 0; i < res.length; i++) {
            int randomNum1 = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            int randomNum2 = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            int smallestNum = Math.min(randomNum1, randomNum2);
            int greatestNum = Math.max(randomNum1, randomNum2);
            String answer = Integer.toString(execute(greatestNum, smallestNum));
            String question = smallestNum + " " + greatestNum;
            res[i] = new String[]{question, answer};
        }
        return res;
    }
    public static void play() {
        var data = build();
        Engine.start(GAME_RULE, data);
    }
}
