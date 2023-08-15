package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 100;

    public static final int MIN_OPRTR_INDX = 0;
    public static final int MAX_OPRTR_INDX = 2;

    public static String[] operators = new String[]{"+", "-", "*"};

    public static String getInput() {
        var sc = new Scanner(System.in);
        return sc.next();
    }

    public static int generateNum(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static String generateOperator() {
        int i = generateNum(MIN_OPRTR_INDX, MAX_OPRTR_INDX);
        return operators[i];
    }
}
