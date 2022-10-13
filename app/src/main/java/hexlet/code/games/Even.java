package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

import java.util.HashMap;
import java.util.Map;

public class Even {

    private static int number;

    public static String getRoundText() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";

    }

    public static boolean isEven() {
        return number % 2 == 0;
    }

    public static String getQuestion() {
        number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }

    public static Map<String, String> prepareData(int rounds) {
        Map<String, String> questionByRightAnswer = new HashMap<>();
        for (int i = 0; i < rounds; i++) {
            questionByRightAnswer.put(getQuestion(), isEven() ? "yes" : "no");
        }
        return questionByRightAnswer;
    }
}
