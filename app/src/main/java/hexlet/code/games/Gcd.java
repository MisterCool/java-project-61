package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Gcd {

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
    }

    public static String getRoundText() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String[] getQuestionAndRightAnswer() {
        String[] questionByRightAnswer = new String[2];
        int firstNumber = RandomUtils.generateRandomNumber();
        int secondNumber = RandomUtils.generateRandomNumber();

        questionByRightAnswer[0] = firstNumber + " " + secondNumber;
        questionByRightAnswer[1] = getRightAnswer(firstNumber, secondNumber);
        return questionByRightAnswer;
    }

    private static String getRightAnswer(int firstNumber, int secondNumber) {
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

        String[][] gameData = new String[rounds][2];

        for (int i = 0; i < gameData.length; i++) {
            String[] questionByRightAnswer = getQuestionAndRightAnswer();
            gameData[i][0] = questionByRightAnswer[0];
            gameData[i][1] = questionByRightAnswer[1];
        }

        return gameData;
    }
}
