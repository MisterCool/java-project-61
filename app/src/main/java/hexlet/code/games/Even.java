package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Even {


    public static final int NUMBER_ROUNDS = 3;

    public static void start() {
        Engine.start(getRoundText(), prepareData(NUMBER_ROUNDS));
    }

    public static String getRoundText() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String getQuestion() {
        int number = RandomUtils.generateRandomNumber();
        return String.valueOf(number);
    }

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            for (int j = 0; j < questionByRightAnswer[i].length - 1; j++) {
                String question = getQuestion();
                questionByRightAnswer[i][j] = question;
                questionByRightAnswer[i][j + 1] = isEven(Integer.parseInt(question)) ? "yes" : "no";
            }
        }

        return questionByRightAnswer;
    }
}
