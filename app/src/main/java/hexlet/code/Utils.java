package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 100;

    public static String getInput() {
        var sc = new Scanner(System.in);
        return sc.next();
    }
    public static int generateNum(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
