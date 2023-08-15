package hexlet.code;

public interface Game {
    static String[][] build() {
        return new String[Utils.ROUNDS_NUM][Utils.ROUND_DATA_NUM];
    }
    static void play() {
        return;
    }
}
