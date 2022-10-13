package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static String mathOperation;

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

    public static Map<String, String> prepareData(int rounds) {
        Map<String, String> questionByRightAnswer = new HashMap<>();
        for (int i = 0; i < rounds; i++) {
            questionByRightAnswer.put(getQuestion(), getRightAnswer());
        }
        return questionByRightAnswer;
    }

    public static String generateRandomMathOperation() {
        Random random = new Random();
        List<String> mathOperations = List.of("+", "-", "*");
        return mathOperations.get(random.nextInt(mathOperations.size()));
    }
}
