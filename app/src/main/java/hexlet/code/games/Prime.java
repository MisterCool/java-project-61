package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Prime {

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
    }

    public static String getRoundText() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String getQuestion() {
        int number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }

    public static String[][] prepareData(int rounds) {

        String[][] gameData = new String[rounds][2];

        for (int i = 0; i < gameData.length; i++) {
            String question = getQuestion();
            gameData[i][0] = question;
            gameData[i][1] = isPrime(Integer.parseInt(question)) ? "yes" : "no";
        }

        return gameData;
    }
}
