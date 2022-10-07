package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static String mathOperation;

    public static String getRightAnswer() {
        return String.valueOf(calculate());
    }

    public static void startRound() {
        System.out.println("What is the result of the expression?");

    }

    public static String getQuestion() {
        firstNumber = RandomUtils.generateRandomNumber();
        secondNumber = RandomUtils.generateRandomNumber();
        mathOperation = RandomUtils.generateRandomMathOperation();

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
}
