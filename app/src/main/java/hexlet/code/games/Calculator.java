package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

import java.util.List;
import java.util.Random;


public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static String mathOperation;

    public static final int NUMBER_ROUNDS = 3;

    public static void start() {
        Engine.start(getRoundText(), prepareData(NUMBER_ROUNDS));
    }

    public static String getRightAnswer() {
        return String.valueOf(calculate());
    }

    public static String getRoundText() {
        return "What is the result of the expression?";
    }

    public static String getQuestion() {
        firstNumber = RandomUtils.generateRandomNumber();
        secondNumber = RandomUtils.generateRandomNumber();
        mathOperation = generateRandomMathOperation();

        return firstNumber + " " + mathOperation + " " + secondNumber;
    }

    public static int calculate() {
        switch (mathOperation) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            default -> throw new RuntimeException("unknown operation");
        }
    }

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][rounds - 1];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            for (int j = 0; j < questionByRightAnswer[i].length - 1; j++) {
                questionByRightAnswer[i][j] = getQuestion();
                questionByRightAnswer[i][j + 1] = getRightAnswer();
            }
        }

        return questionByRightAnswer;
    }

    public static String generateRandomMathOperation() {
        Random random = new Random();
        List<String> mathOperations = List.of("+", "-", "*");
        return mathOperations.get(random.nextInt(mathOperations.size()));
    }
}
