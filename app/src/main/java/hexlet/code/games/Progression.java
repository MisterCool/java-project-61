package hexlet.code.games;

import hexlet.code.Engine;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static hexlet.code.utils.RandomUtils.generateRandomNumber;

public class Progression {

    private static final int RECOMMENDED_LENGTH_SEQ = 10;

    private static int rightAnswer;

    public static final int NUMBER_ROUNDS = 3;

    public static void start() {
        Engine.start(getRoundText(), prepareData(NUMBER_ROUNDS));
    }

    public static String getRightAnswer() {
        return String.valueOf(rightAnswer);
    }


    public static String getRoundText() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        int startNumber = generateRandomNumber();
        int step = generateRandomNumber();

        List<Integer> integers = IntStream.iterate(startNumber, n -> n + step)
                .limit(RECOMMENDED_LENGTH_SEQ)
                .boxed().toList();

        StringBuilder seq = new StringBuilder();
        int hiddenElementIndex = generateRandomIndex(RECOMMENDED_LENGTH_SEQ);

        for (int i = 0; i < integers.size(); i++) {
            if (i == hiddenElementIndex) {
                rightAnswer = integers.get(i);
                seq.append(" ").append("..");
            } else {
                seq.append(" ").append(integers.get(i));
            }
        }

        return seq.toString().trim();
    }

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            for (int j = 0; j < questionByRightAnswer[i].length - 1; j++) {
                questionByRightAnswer[i][j] = getQuestion();
                questionByRightAnswer[i][j + 1] = getRightAnswer();
            }
        }

        return questionByRightAnswer;
    }

    public static int generateRandomIndex(int arraySize) {
        Random random = new Random();
        return random.nextInt(arraySize);
    }
}
