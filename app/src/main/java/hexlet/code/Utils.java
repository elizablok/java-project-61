package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static String getInput() {
        var sc = new Scanner(System.in);
        return sc.next();
    }

    public static int generateNum(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
