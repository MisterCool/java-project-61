package hexlet.code.games;

import hexlet.code.Engine;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static hexlet.code.utils.RandomUtils.generateRandomNumber;

public class Progression {

    private static final int RECOMMENDED_LENGTH_SEQ = 10;

    public static void start() {
        Engine.start(getRoundText(), prepareData(Engine.NUMBER_ROUNDS));
    }

    public static String getRoundText() {
        return "What number is missing in the progression?";
    }

    public static String[] getQuestion() {
        int startNumber = generateRandomNumber();
        int step = generateRandomNumber();
        String[] progressionByHiddenElement = new String[2];
        List<Integer> arithmeticProgression = IntStream.iterate(startNumber, n -> n + step)
                .limit(RECOMMENDED_LENGTH_SEQ)
                .boxed().toList();

        StringBuilder seq = new StringBuilder();
        int hiddenElementIndex = generateRandomIndex(RECOMMENDED_LENGTH_SEQ);

        for (int i = 0; i < arithmeticProgression.size(); i++) {
            if (i == hiddenElementIndex) {
                progressionByHiddenElement[1] = String.valueOf(arithmeticProgression.get(i));
                seq.append(" ").append("..");
            } else {
                seq.append(" ").append(arithmeticProgression.get(i));
            }
        }

        progressionByHiddenElement[0] = seq.toString().trim();
        return progressionByHiddenElement;
    }

    public static String[][] prepareData(int rounds) {

        String[][] questionByRightAnswer = new String[rounds][2];

        for (int i = 0; i < questionByRightAnswer.length; i++) {
            String[] question = getQuestion();
            questionByRightAnswer[i][0] = question[0];
            questionByRightAnswer[i][1] = question[1];
        }

        return questionByRightAnswer;
    }

    public static int generateRandomIndex(int arraySize) {
        Random random = new Random();
        return random.nextInt(arraySize);
    }
}
