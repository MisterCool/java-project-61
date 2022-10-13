package hexlet.code.utils;

import java.util.Random;

public class RandomUtils {

    private static final int BOUND = 100;
    private static final Random RANDOM = new Random();
    public static int generateRandomNumber() {
        return RANDOM.nextInt(BOUND);
    }
}
