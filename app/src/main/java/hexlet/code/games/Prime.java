package hexlet.code.games;

import hexlet.code.utils.RandomUtils;

public class Prime {

    private static int number;

    public static void startRound() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String getRightAnswer() {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    public static String getQuestion() {
        number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }
}
