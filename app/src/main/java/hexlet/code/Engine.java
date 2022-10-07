package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static int numberRounds = 3;
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void gameStartCalc(String username) {
        Calculator.startRound();
        while (numberRounds != 0) {
            System.out.println("Question: " + Calculator.getQuestion());
            String userAnswer = SCANNER.next();

            String rightAnswer = Calculator.getRightAnswer();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                numberRounds--;
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

    public static void gameStartEven(String username) {
        Even.startRound();
        while (numberRounds != 0) {
            System.out.println("Question: " + Even.getQuestion());
            String userAnswer = SCANNER.next();

            String rightAnswer = Even.getRightAnswer();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                numberRounds--;
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

    public static void gameStartGcd(String username) {
        Gcd.startRound();
        while (numberRounds != 0) {
            System.out.println("Question: " + Gcd.getQuestion());
            String userAnswer = SCANNER.next();

            String rightAnswer = Gcd.getRightAnswer();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                numberRounds--;
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

    public static void gameStartProgression(String username) {
        Progression.startRound();
        while (numberRounds != 0) {
            System.out.println("Question: " + Progression.getQuestion());
            String userAnswer = SCANNER.next();

            String rightAnswer = Progression.getRightAnswer();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                numberRounds--;
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

    public static void gameStartPrime(String username) {
        Prime.startRound();
        while (numberRounds != 0) {
            System.out.println("Question: " + Prime.getQuestion());
            String userAnswer = SCANNER.next();

            String rightAnswer = Prime.getRightAnswer();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                numberRounds--;
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
