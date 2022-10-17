package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Gcd {

    private static int firstNumber;
    private static int secondNumber;

    public static final int NUMBER_ROUNDS = 3;

    public static void start() {
        Engine.start(getRoundText(), prepareData(NUMBER_ROUNDS));
    }

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

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            for (int j = 0; j < questionByRightAnswer[i].length - 1; j++) {
                questionByRightAnswer[i][j] = getQuestion();
                questionByRightAnswer[i][j + 1] = getRightAnswer();
            }
        }

        return questionByRightAnswer;
    }
}
