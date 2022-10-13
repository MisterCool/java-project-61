package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import static hexlet.code.utils.RandomUtils.generateRandomNumber;

public class Progression {

    private static final int RECOMMENDED_LENGTH_SEQ = 10;

    public static String getRightAnswer() {
        return String.valueOf(rightAnswer);
    }

    private static int rightAnswer;

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

    public static Map<String, String> prepareData(int rounds) {
        Map<String, String> questionByRightAnswer = new HashMap<>();
        for (int i = 0; i < rounds; i++) {
            questionByRightAnswer.put(getQuestion(), getRightAnswer());
        }
        return questionByRightAnswer;
    }

    public static int generateRandomIndex(int arraySize) {
        Random random = new Random();
        return random.nextInt(arraySize);
    }
}
