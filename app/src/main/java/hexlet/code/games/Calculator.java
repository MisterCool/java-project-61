package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

import java.util.List;
import java.util.Random;


public class Calculator {

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
    }

    private static String getRightAnswer(String question) {
        var arguments = question.split(" ");
        int firstNumber = Integer.parseInt(arguments[0]);
        String operation = arguments[1];
        int secondNumber = Integer.parseInt(arguments[2]);
        return String.valueOf(calculate(firstNumber, secondNumber, operation));
    }

    public static String getRoundText() {
        return "What is the result of the expression?";
    }

    private static String getQuestion() {
        int firstNumber = RandomUtils.generateRandomNumber();
        int secondNumber = RandomUtils.generateRandomNumber();
        String mathOperation = generateRandomMathOperation();

        return firstNumber + " " + mathOperation + " " + secondNumber;
    }

    private static int calculate(int firstNumber, int secondNumber, String mathOperation) {
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
            default -> throw new RuntimeException("Unknown operation");
        }
    }

    public static String[][] prepareData(int rounds) {

        var gameData = new String[rounds][2];

        for (int i = 0; i < gameData.length; i++) {
            String question = getQuestion();
            gameData[i][0] = question;
            gameData[i][1] = getRightAnswer(question);
        }

        return gameData;
    }

    private static String generateRandomMathOperation() {
        Random random = new Random();
        List<String> mathOperations = List.of("+", "-", "*");
        return mathOperations.get(random.nextInt(mathOperations.size()));
    }
}
