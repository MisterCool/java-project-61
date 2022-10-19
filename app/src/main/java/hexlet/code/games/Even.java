package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomUtils;

public class Even {

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
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

        var questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            String question = getQuestion();
            questionByRightAnswer[i][0] = question;
            questionByRightAnswer[i][1] = isEven(Integer.parseInt(question)) ? "yes" : "no";

        }

        return questionByRightAnswer;
    }
}
