package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.Utils;

public class PrimeGame implements Game {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean execute(int num) {
        for (int divisor = 2, root = (int) Math.sqrt(num); divisor <= root; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    private static String[][] build() {
        var res = new String[Utils.ROUNDS_NUM][Utils.ROUND_DATA_NUM];
        for (var i = 0; i < res.length; i++) {
            int randomNum = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            String answer = execute(randomNum) ? "yes" : "no";
            String question = Integer.toString(randomNum);
            res[i] = new String[]{question, answer};
        }
        return res;
    }
    public static void play() {
        var data = build();
        Engine.start(GAME_RULE, data);
    }
}
