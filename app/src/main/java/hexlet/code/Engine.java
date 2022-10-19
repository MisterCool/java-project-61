package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_ROUNDS = 3;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void start(String textRound, String[][] questionByRightAnswer) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        String greetings = "Hello, %s!";
        System.out.println(String.format(greetings, username));

        System.out.println(textRound);


        for (String[] strings : questionByRightAnswer) {
            for (int j = 0; j < strings.length - 1; j++) {
                System.out.println("Question: " + strings[j]);
                String userAnswer = SCANNER.next();

                String rightAnswer = strings[j + 1];

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
}
