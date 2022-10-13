package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

import java.util.HashMap;
import java.util.Map;

public class Gcd {

    private static int firstNumber;
    private static int secondNumber;

    public static String getRoundText() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        firstNumber = RandomUtils.generateRandomNumber();
        secondNumber = RandomUtils.generateRandomNumber();
        return firstNumber + " " + secondNumber;
    }

    public static String getRightAnswer() {
        if (firstNumber == 0 || secondNumber == 0) {
            return String.valueOf(Math.max(firstNumber, secondNumber));
        }
        while (firstNumber != secondNumber) {

            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return String.valueOf(firstNumber);
    }

    public static Map<String, String> prepareData(int rounds) {
        Map<String, String> questionByRightAnswer = new HashMap<>();
        for (int i = 0; i < rounds; i++) {
            questionByRightAnswer.put(getQuestion(), getRightAnswer());
        }
        return questionByRightAnswer;
    }
}
