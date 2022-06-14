package info.sjd.util;

import java.util.Random;

public class DigitUtil {

    public static int getRandomNumberInRange(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
