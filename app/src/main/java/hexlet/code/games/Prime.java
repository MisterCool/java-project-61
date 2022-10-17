package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Prime {


    public static final int NUMBER_ROUNDS = 3;

    public static void start() {
        Engine.start(getRoundText(), prepareData(NUMBER_ROUNDS));
    }

    public static String getRoundText() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static boolean isPrime(int number) {
        int absNumber = Math.abs(number);
        if (absNumber == 0 || absNumber == 1) {
            return false;
        }
        for (int i = 2; i <= absNumber / 2; ++i) {
            if (absNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getQuestion() {
        int number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][rounds - 1];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            for (int j = 0; j < questionByRightAnswer[i].length - 1; j++) {
                String question = getQuestion();
                questionByRightAnswer[i][j] = question;
                questionByRightAnswer[i][j + 1] = isPrime(Integer.parseInt(question)) ? "yes" : "no";
            }
        }

        return questionByRightAnswer;
    }
}
