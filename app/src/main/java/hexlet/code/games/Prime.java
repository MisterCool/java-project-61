package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

import java.util.HashMap;
import java.util.Map;

public class Prime {

    private static int number;

    public static String getRoundText() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static boolean isPrime() {
        int absNumber = Math.abs(number);
        if (absNumber == 0 || absNumber == 1) {
            return false;
        }
        for (int i = 2; i <= absNumber / 2; ++i) {
            if (absNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getQuestion() {
        number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }

    public static Map<String, String> prepareData(int rounds) {
        Map<String, String> questionByRightAnswer = new HashMap<>();
        for (int i = 0; i < rounds; i++) {
            questionByRightAnswer.put(getQuestion(), isPrime() ? "yes" : "no");
        }
        return questionByRightAnswer;
    }
}
