package hexlet.code.utils;

import java.util.List;
import java.util.Random;

public class RandomUtils {

    private static final int BOUND = 100;
    private static final Random RANDOM = new Random();
    public static int generateRandomNumber() {
        return RANDOM.nextInt(BOUND);
    }

    public static String generateRandomMathOperation() {
        List<String> mathOperations = List.of("+", "-", "*");
        return mathOperations.get(RANDOM.nextInt(mathOperations.size()));
    }

    public static int generateRandomIndex(int arraySize) {
        return RANDOM.nextInt(arraySize);
    }
}
