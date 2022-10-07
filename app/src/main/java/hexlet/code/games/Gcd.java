package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public class Gcd {

    private static int firstNumber;
    private static int secondNumber;

    public static void startRound() {
        System.out.println("Find the greatest common divisor of given numbers.");
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
}
