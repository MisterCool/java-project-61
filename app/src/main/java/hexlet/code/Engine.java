package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {

    public static final int NUMBER_ROUNDS = 3;

    public static int getNumberRounds() {
        return NUMBER_ROUNDS;
    }

    private static final Scanner SCANNER = new Scanner(System.in);

    private static String username;

    public static void greetingToTheUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner scan = new Scanner(System.in);
        username = scan.next();
        String greetings = "Hello, %s!";
        System.out.println(String.format(greetings, username));
    }

    public static void start(String textRound, Map<String, String> questionByRightAnswer) {

        greetingToTheUser();

        System.out.println(textRound);

        for (Map.Entry<String, String> entry : questionByRightAnswer.entrySet()) {
            System.out.println("Question: " + entry.getKey());

            String userAnswer = SCANNER.next();

            String rightAnswer = entry.getValue();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + rightAnswer + "'.");

                System.out.println("Let's try again, " + username + "!");
                return;
            }
            SCANNER.reset();
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
