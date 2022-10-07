package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public class Even {

    private static int number;

    public static void startRound() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

    }

    public static String getRightAnswer() {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    public static String getQuestion() {
        number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }
}
