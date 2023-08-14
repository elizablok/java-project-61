package hexlet.code;

public class EvenGame implements Game {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;
    private static boolean check(int num) {
        return num % 2 == 0;
    }

    private static String[][] build() {
        var res = new String[3][2];
        for (var i = 0; i < res.length; i++) {
            int randomNum = Utils.generateNum(MIN_NUM, MAX_NUM);
            String answer = check(randomNum) ? "yes" : "no";
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
