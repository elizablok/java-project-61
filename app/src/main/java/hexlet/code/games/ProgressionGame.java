package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class ProgressionGame implements Game {
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int MIN_PRGRSSN_LEN = 5;
    private static final int MAX_PRGRSSN_LEN = 10;

    private static int[] generateProgression(int startNum, int diff, int length) {
        int[] progression = new int[length];
        for (int i = 0, num = startNum; i < length; i++, num += diff) {
            progression[i] = num;
        }
        return progression;
    }
    private static String stringifyProgression(int[] progression, int missingMmbrIndx) {
        var res = new StringJoiner(" ");
        for (int i = 0; i < progression.length; i++) {
            if (i == missingMmbrIndx) {
                res.add("..");
                continue;
            }
            res.add(Integer.toString(progression[i]));
        }
        return res.toString();
    }
    private static String[][] build() {
        var res = new String[Utils.ROUNDS_NUM][Utils.ROUND_DATA_NUM];
        for (var i = 0; i < res.length; i++) {
            int startNum = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            int diff = Utils.generateNum(Utils.MIN_NUM, Utils.MAX_NUM);
            int length = Utils.generateNum(MIN_PRGRSSN_LEN, MAX_PRGRSSN_LEN);
            int[] progression = generateProgression(startNum, diff, length);
            int missingMmbrIndx = Utils.generateNum(0, length - 1);
            String question = stringifyProgression(progression, missingMmbrIndx);
            String answer = Integer.toString(progression[missingMmbrIndx]);
            res[i] = new String[]{question, answer};
        }
        return res;
    }
    public static void play() {
        var data = build();
        Engine.start(GAME_RULE, data);
    }
}
