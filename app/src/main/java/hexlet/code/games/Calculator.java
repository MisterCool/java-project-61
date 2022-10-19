package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

import java.util.List;
import java.util.Random;


public class Calculator {

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
    }

    public static String getRightAnswer(String question) {
        var arguments = question.split(" ");
        int firstNumber = Integer.parseInt(arguments[0]);
        int secondNumber = Integer.parseInt(arguments[1]);
        String operation = arguments[2];
        return String.valueOf(calculate(firstNumber, secondNumber, operation));
    }

    public static String getRoundText() {
        return "What is the result of the expression?";
    }

    public static String getQuestion() {
        int firstNumber = RandomUtils.generateRandomNumber();
        int secondNumber = RandomUtils.generateRandomNumber();
        String mathOperation = generateRandomMathOperation();

        return firstNumber + " " + mathOperation + " " + secondNumber;
    }

    public static int calculate(int firstNumber, int secondNumber, String mathOperation) {
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

        var questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            String question = getQuestion();
            questionByRightAnswer[i][0] = question;
            questionByRightAnswer[i][1] = getRightAnswer(question);
        }

        return questionByRightAnswer;
    }

    public static String generateRandomMathOperation() {
        Random random = new Random();
        List<String> mathOperations = List.of("+", "-", "*");
        return mathOperations.get(random.nextInt(mathOperations.size()));
    }
}
