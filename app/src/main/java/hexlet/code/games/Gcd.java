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

    public static String getQuestion() {
        int firstNumber = RandomUtils.generateRandomNumber();
        int secondNumber = RandomUtils.generateRandomNumber();
        return firstNumber + " " + secondNumber;
    }

    public static String getRightAnswer(int firstNumber, int secondNumber) {
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
            String question = getQuestion();
            questionByRightAnswer[i][0] = question;
            questionByRightAnswer[i][1] = getRightAnswer(
                 Integer.parseInt(question.split(" ")[0]),
                    Integer.parseInt(question.split(" ")[1]));
        }

        return questionByRightAnswer;
    }
}
